package com.doltics.commerce.repository.stores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.OrderOperations;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;

public interface OrderOperationsRepository extends JpaRepository<OrderOperations, Long>{
	
	OrderOperations findByOrderAndsite(Orders order, Site site);
}
