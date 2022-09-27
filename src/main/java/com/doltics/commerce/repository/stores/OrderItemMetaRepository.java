package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.OrderItemMeta;
import com.doltics.commerce.entity.stores.OrderItems;
import com.doltics.commerce.entity.stores.Site;

public interface OrderItemMetaRepository extends JpaRepository<OrderItemMeta, Long>{
	
	List<OrderItemMeta> findByOrderItemsAndSite(OrderItems orderItems, Site site);
	
	OrderItemMeta findBySiteAndMetaKeyAndOrderItems(Site site, String metaKey, OrderItems orderItems);
}
