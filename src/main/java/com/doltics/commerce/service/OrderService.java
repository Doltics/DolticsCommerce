package com.doltics.commerce.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import com.doltics.commerce.request.OrderCreatedRequest;
import com.doltics.commerce.response.GenericMessage;

@Service
public class OrderService {

	/**
	 * 
	 * <p>
	 * Process order.
	 * </p>
	 *
	 * @param orderCreatedRequest
	 * @return
	 */
	public CompletableFuture<GenericMessage> processOrder(OrderCreatedRequest orderCreatedRequest) {
		
	}
}
