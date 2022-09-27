package com.doltics.commerce.entity.stores;

import com.doltics.commerce.constants.SiteStatus;
import com.doltics.commerce.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
 * 
 * Site to connect to.
 * 
 * @author <a href="mailto:paul@hubloy.com">Paul Kevin</a>
 * @version enter version, 26 Sept 2022
 * @since  enter jdk version
 */
@Entity(name = "site")
public class Site extends AbstractEntity{

	private static final long serialVersionUID = -800696272068467250L;

	private static final String PGNAME = "site_";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PGNAME + "generator")
	@SequenceGenerator(name = PGNAME + "generator", sequenceName = PGNAME + "sequence")
	protected Long id;
	
	@Column(name = "domain", nullable = false)
	private String domain;

	@Column(name = "api_key", nullable = false, unique = true)
	private String apiKey;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "site_status")
	private SiteStatus siteStatus;
	
	@Column(name = "consumer_key", nullable = true)
	private String consumerKey;
	
	@Column(name = "consumer_secret", nullable = true)
	private String consumerSecret;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the apiKey
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * @param apiKey the apiKey to set
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @return the siteStatus
	 */
	public SiteStatus getSiteStatus() {
		return siteStatus;
	}

	/**
	 * @param siteStatus the siteStatus to set
	 */
	public void setSiteStatus(SiteStatus siteStatus) {
		this.siteStatus = siteStatus;
	}

	/**
	 * @return the consumerKey
	 */
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * @param consumerKey the consumerKey to set
	 */
	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	/**
	 * @return the consumerSecret
	 */
	public String getConsumerSecret() {
		return consumerSecret;
	}

	/**
	 * @param consumerSecret the consumerSecret to set
	 */
	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}
}