package com.doltics.commerce.repository.stores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.Site;

public interface SiteRepository extends JpaRepository<Site, Long> {

	Site findByDomain(String domain);

	Site findByApiKey(String apiKey);

	Site findByDomainAndApiKey(String domain, String apiKey);
}
