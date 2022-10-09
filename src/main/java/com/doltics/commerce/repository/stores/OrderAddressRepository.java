package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.OrderAddress;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;

public interface OrderAddressRepository extends JpaRepository<OrderAddress, Long>{
	
	List<OrderAddress> findBySite(Site site, Pageable pageable);
	
	OrderAddress findBySiteAndOrder(Site site, Orders order);
	
	OrderAddress findBySiteAndOrderAndAddressType(Site site, Orders order, String addressType);
}
