package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.OrderItems;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long>{
	
	List<OrderItems> findByOrderAndSite(Orders order, Site site);
	
	OrderItems findBySiteAndOrderAndOrderItemId(Site site, Orders order, String orderItemId);
}
