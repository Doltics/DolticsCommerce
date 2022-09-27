package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.Customer;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

	List<Orders> findBySite(Site site, Pageable pageable);

	List<Orders> findBySiteAndCustomer(Site site, Customer customer, Pageable pageable);

	List<Orders> findBySiteAndBillingEmail(Site site, String billingEmail, Pageable pageable);

	List<Orders> findBySiteAndStatus(Site site, String status, Pageable pageable);

	List<Orders> findBySiteAndType(Site site, String type, Pageable pageable);

	List<Orders> findBySiteAndStatusAndCustomer(Site site, String status, Customer customer, Pageable pageable);

	Orders findBySiteAndOrderId(Site site, String orderId);

	Long countBySite(Site site);

	Long countBySiteAndCustomer(Site site, Customer customer);

	Long countBySiteAndBillingEmail(Site site, String billingEmail);

	Long countBySiteAndStatus(Site site, String status);

	Long countBySiteAndType(Site site, String type);

	Long countBySiteAndStatusAndCustomer(Site site, String status, Customer customer);
}
