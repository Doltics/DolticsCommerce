package com.doltics.commerce.controller.store;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.doltics.commerce.constants.StatusTypes;
import com.doltics.commerce.response.GenericMessage;
import com.doltics.commerce.service.SiteService;

@RestController("site")
public class SiteController {
	
	@Autowired
	private SiteService siteService;
	
	/**
	 * 
	 * <p>
	 * Validate site connection.
	 * </p>
	 *
	 * @param domain
	 * @param apiKey
	 * @return
	 */
	@GetMapping( value = "/validate")
	public GenericMessage validateSite(
			@RequestHeader(name = "domain", required = true) String domain,
			@RequestHeader(name = "api_key", required = true) String apiKey) {
		CompletableFuture<GenericMessage> response = siteService.validateSite(domain, apiKey);
		CompletableFuture.allOf(response).join();
		try {
			return response.get();
		} catch (InterruptedException e) {
			return new GenericMessage(StatusTypes.ERROR, "An error occured " + e.getMessage());
		} catch (ExecutionException e) {
			return new GenericMessage(StatusTypes.ERROR, "An error occured " + e.getMessage());
		}
	}
}
