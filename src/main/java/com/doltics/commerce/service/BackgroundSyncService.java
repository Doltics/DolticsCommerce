package com.doltics.commerce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.doltics.commerce.entity.stores.Site;
import com.icoderman.woocommerce.ApiVersionType;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import com.icoderman.woocommerce.WooCommerceAPI;
import com.icoderman.woocommerce.oauth.OAuthConfig;

@Service
public class BackgroundSyncService {

	/**
	 * 
	 * <p>
	 * Process remote orders
	 * </p>
	 *
	 * @param site
	 * @return
	 */
	public boolean processOrders(Site site) {
		OAuthConfig config = new OAuthConfig(site.getDomain(), site.getConsumerKey(), site.getConsumerSecret());
		WooCommerce wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);
		Map<String, String> params = null;
		List orders = null;
		int page = 1;
		do {
			params = new HashMap<String, String>();
			params.put("per_page", "100");
			params.put("page", page+"");
			orders = wooCommerce.getAll(EndpointBaseType.ORDERS.getValue(), params);
			if (orders.isEmpty()) {
				return false;
			}
			// Async function to process.
			// Set site to syncing.
			page++;
			try {
				TimeUnit.SECONDS.sleep(30);
			} catch (InterruptedException e) {
				return false;
			}
		} while (!orders.isEmpty());
		return false;
	}
}