package com.doltics.commerce.entity.stores;

import com.doltics.commerce.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(indexes = { 
			@Index(name = "order_status", columnList = "status", unique = false),
			@Index(name = "order_customer_email", columnList = "customer_id,biling_email", unique = false),
			@Index(name = "order_status_type", columnList = "status,order_type", unique = false),
			@Index(name = "order_site", columnList = "order_id,site_id", unique = false),
			@Index(name = "order_biling_email", columnList = "biling_email", unique = false)
		}
)
public class Orders extends AbstractEntity {

	private static final long serialVersionUID = 3153521225116459490L;

	private static final String PGNAME = "orders_";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PGNAME + "generator")
	@SequenceGenerator(name = PGNAME + "generator", sequenceName = PGNAME + "sequence")
	protected Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id")
	private Site site;

	@Column(name = "order_id", nullable = false)
	private String orderId;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "currency", nullable = false)
	private String currency;

	@Column(name = "order_type")
	private String type;

	@Column(name = "tax_amount")
	private Double taxAmount;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Column(name = "biling_email")
	private String billingEmail;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_order_id")
	private Orders parentOrder;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "payment_method_title", nullable = true, columnDefinition = "text")
	private String paymentMethodTitle;

	@Column(name = "transaction_id")
	private String transactionId;

	@Column(name = "ip_address")
	private String ipAddress;

	@Column(name = "user_agent", nullable = true, columnDefinition = "text")
	private String userAgent;

	@Column(name = "customer_note", nullable = true, columnDefinition = "text")
	private String customerNote;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the taxAmount
	 */
	public Double getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the billingEmail
	 */
	public String getBillingEmail() {
		return billingEmail;
	}

	/**
	 * @param billingEmail the billingEmail to set
	 */
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}

	/**
	 * @return the parentOrder
	 */
	public Orders getParentOrder() {
		return parentOrder;
	}

	/**
	 * @param parentOrder the parentOrder to set
	 */
	public void setParentOrder(Orders parentOrder) {
		this.parentOrder = parentOrder;
	}

	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the paymentMethodTitle
	 */
	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	/**
	 * @param paymentMethodTitle the paymentMethodTitle to set
	 */
	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param userAgent the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * @return the customerNote
	 */
	public String getCustomerNote() {
		return customerNote;
	}

	/**
	 * @param customerNote the customerNote to set
	 */
	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

}
