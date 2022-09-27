package com.doltics.commerce.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.doltics.commerce.entity.stores.Site;
import com.doltics.commerce.repository.stores.SiteRepository;
import com.doltics.commerce.response.GenericMessage;
import com.doltics.commerce.utils.StatusUtils;

@Service
public class SiteService {

	@Autowired
	private SiteRepository siteRepository;
	
	/**
	 * 
	 * <p>
	 * Validate site
	 * </p>
	 *
	 * @param domain
	 * @param apiKey
	 * @return
	 */
	@Async("asyncExecutor")
	public CompletableFuture<GenericMessage> validateSite(String domain, String apiKey) {
		boolean valid = isValidSite(domain, apiKey);
		if (valid) {
			return CompletableFuture.completedFuture(new GenericMessage(StatusUtils.SUCCESS, "Site connected")); 
		}
		return CompletableFuture.completedFuture(new GenericMessage(StatusUtils.ERROR, "Invalid site")); 
	}
	
	/**
	 * 
	 * <p>
	 * Get site
	 * </p>
	 *
	 * @param domain
	 * @param apiKey
	 * @return
	 */
	public Site getSite(String domain, String apiKey) {
		return siteRepository.findByDomainAndApiKey(domain, apiKey);
	}
	
	/**
	 * 
	 * <p>
	 * Validate site
	 * </p>
	 *
	 * @param domain
	 * @param apiKey
	 * @return
	 */
	public boolean isValidSite(String domain, String apiKey) {
		Site site = getSite(domain, apiKey);
		return site != null;
	}
}
