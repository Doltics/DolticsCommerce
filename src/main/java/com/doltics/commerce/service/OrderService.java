package com.doltics.commerce.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.doltics.commerce.constants.StatusTypes;
import com.doltics.commerce.entity.stores.Customer;
import com.doltics.commerce.entity.stores.OrderAddress;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;
import com.doltics.commerce.repository.stores.CustomerRepository;
import com.doltics.commerce.repository.stores.OrderAddressRepository;
import com.doltics.commerce.repository.stores.OrderItemMetaRepository;
import com.doltics.commerce.repository.stores.OrderItemsRepository;
import com.doltics.commerce.repository.stores.OrderOperationsRepository;
import com.doltics.commerce.repository.stores.OrdersRepository;
import com.doltics.commerce.request.OrderCreatedRequest;
import com.doltics.commerce.request.sections.OrderFormDetailsRequest;
import com.doltics.commerce.response.GenericEntityMessage;
import com.doltics.commerce.utils.DateUtils;

/**
 * 
 * Add a brief description of OrderService Order syncs from remote come with the
 * order ID. Then we do a pull to the API with that order id. we do not get full
 * payload from the api for the json
 * 
 * @author <a href="mailto:paul@hubloy.com">Paul Kevin</a>
 * @version enter version, 30 Sept 2022
 * @since enter jdk version
 */
@Service
public class OrderService {

	private final OrdersRepository ordersRepository;

	private final CustomerRepository customerRepository;

	private final OrderAddressRepository orderAddressRepository;

	private final OrderItemMetaRepository orderItemMetaRepository;

	private final OrderItemsRepository orderItemsRepository;

	private final OrderOperationsRepository orderOperationsRepository;

	@Autowired
	public OrderService(OrdersRepository ordersRepository, CustomerRepository customerRepository,
			OrderAddressRepository orderAddressRepository, OrderItemMetaRepository orderItemMetaRepository,
			OrderItemsRepository orderItemsRepository, OrderOperationsRepository orderOperationsRepository) {
		super();
		this.ordersRepository = ordersRepository;
		this.customerRepository = customerRepository;
		this.orderAddressRepository = orderAddressRepository;
		this.orderItemMetaRepository = orderItemMetaRepository;
		this.orderItemsRepository = orderItemsRepository;
		this.orderOperationsRepository = orderOperationsRepository;
	}

	/**
	 * 
	 * <p>
	 * Process order.
	 * </p>
	 *
	 * @param orderCreatedRequest
	 * @return
	 */
	@Async("asyncExecutor")
	public CompletableFuture<GenericEntityMessage> processOrder(OrderCreatedRequest orderCreatedRequest, Site site) {
		Orders orders = saveOrder(orderCreatedRequest, site);
		saveAddress(orderCreatedRequest, site, orders);
		
		return CompletableFuture.completedFuture(new GenericEntityMessage(StatusTypes.SUCCESS, "Invalid site"));
	}

	/**
	 * 
	 * <p>
	 * Save the order
	 * </p>
	 *
	 * @param orderCreatedRequest
	 * @param site
	 * @return
	 */
	private Orders saveOrder(OrderCreatedRequest orderCreatedRequest, Site site) {
		Customer customer = saveCustomer(orderCreatedRequest, site);
		
		Orders order = ordersRepository.findBySiteAndOrderId(site, orderCreatedRequest.getId());
		if (order == null) {
			order = new Orders();
			order.setSite(site);
			order.setOrderId(orderCreatedRequest.getId());
		}
		order.setStatus(orderCreatedRequest.getStatus());
		order.setCurrency(orderCreatedRequest.getCurrency());
		order.setTaxAmount(Double.valueOf(orderCreatedRequest.getTotalTax()));
		order.setCustomer(customer);
		order.setBillingEmail(orderCreatedRequest.getBilling().getEmail());
		if (orderCreatedRequest.getParentId() != null && !orderCreatedRequest.getParentId().isEmpty()) {
			Orders parentOrder = ordersRepository.findBySiteAndOrderId(site, orderCreatedRequest.getParentId());
			if (parentOrder != null) {
				order.setParentOrder(parentOrder);
			}
		}
		order.setPaymentMethod(orderCreatedRequest.getPaymentMethod());
		order.setPaymentMethodTitle(orderCreatedRequest.getPaymentMethodTitle());
		order.setTransactionId(orderCreatedRequest.getTransactionId());
		order.setIpAddress(orderCreatedRequest.getCustomerIpAddress());
		order.setUserAgent(orderCreatedRequest.getCustomerUserAgent());
		order.setCustomerNote(orderCreatedRequest.getCustomerNote());
		order.setOrderDateCreated(DateUtils.formatDateTimeToSQLDate(orderCreatedRequest.getDateCreated()));
		
		Orders savedOrder = ordersRepository.saveAndFlush(order);
		return savedOrder;
	}
	
	/**
	 * 
	 * <p>
	 * Save the customer
	 * </p>
	 *
	 * @param orderCreatedRequest
	 * @param site
	 * @return
	 */
	private Customer saveCustomer(OrderCreatedRequest orderCreatedRequest, Site site) {
		Customer customer = customerRepository.findBySiteAndEmail(site, orderCreatedRequest.getBilling().getEmail());
		if (customer != null) {
			return customer;
		}
		customer = new Customer();
		customer.setSite(site);
		customer.setEmail(orderCreatedRequest.getBilling().getEmail());
		return customerRepository.saveAndFlush(customer);
	}
	
	/**
	 * 
	 * <p>
	 * Save the order address
	 * </p>
	 *
	 * @param orderCreatedRequest
	 * @param site
	 * @param order
	 */
	private void saveAddress(OrderCreatedRequest orderCreatedRequest, Site site, Orders order) {
		OrderFormDetailsRequest billing = orderCreatedRequest.getBilling();
		OrderAddress billingAddress = orderAddressRepository.findBySiteAndOrderAndAddressType(site, order, "billing");
		if (billingAddress == null) {
			billingAddress = new OrderAddress();
			billingAddress.setSite(site);
			billingAddress.setOrder(order);
			billingAddress.setAddressType("billing");
		}
		billingAddress.setFirstName(billing.getFirstName());
		billingAddress.setLastName(billing.getLastName());
		billingAddress.setCompany(billing.getCompany());
		billingAddress.setAddress1(billing.getAddress1());
		billingAddress.setAddress2(billing.getAddress2());
		billingAddress.setCity(billing.getCity());
		billingAddress.setState(billing.getState());
		billingAddress.setPostCode(billing.getPostcode());
		billingAddress.setCountry(billing.getCountry());
		billingAddress.setEmail(billing.getEmail());
		billingAddress.setPhone(billing.getPhone());
		orderAddressRepository.saveAndFlush(billingAddress);
		
		OrderFormDetailsRequest shipping = orderCreatedRequest.getShipping();
		OrderAddress shippingAddress = orderAddressRepository.findBySiteAndOrderAndAddressType(site, order, "shipping");
		if (shippingAddress == null) {
			shippingAddress = new OrderAddress();
			shippingAddress.setSite(site);
			shippingAddress.setOrder(order);
			shippingAddress.setAddressType("shipping");
		}
		shippingAddress.setFirstName(shipping.getFirstName());
		shippingAddress.setLastName(shipping.getLastName());
		shippingAddress.setCompany(shipping.getCompany());
		shippingAddress.setAddress1(shipping.getAddress1());
		shippingAddress.setAddress2(shipping.getAddress2());
		shippingAddress.setCity(shipping.getCity());
		shippingAddress.setState(shipping.getState());
		shippingAddress.setPostCode(shipping.getPostcode());
		shippingAddress.setCountry(shipping.getCountry());
		shippingAddress.setEmail(shipping.getEmail());
		shippingAddress.setPhone(shipping.getPhone());
		orderAddressRepository.saveAndFlush(shippingAddress);
	}
	
	private void saveOrderItems(OrderCreatedRequest orderCreatedRequest, Site site, Orders order) {
		
	}
}
