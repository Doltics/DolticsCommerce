package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.OrderMeta;
import com.doltics.commerce.entity.stores.Orders;
import com.doltics.commerce.entity.stores.Site;

public interface OrderMetaRepository extends JpaRepository<OrderMeta, Long>{
	
	List<OrderMeta> findBySiteAndOrder(Site site, Orders order);
	
	OrderMeta findBySiteAndOrderAndMetaKey(Site site, Orders order, String metaKey);
}
