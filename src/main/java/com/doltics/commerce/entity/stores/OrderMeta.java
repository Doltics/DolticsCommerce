package com.doltics.commerce.entity.stores;

import com.doltics.commerce.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(indexes = { 
		@Index(name = "order_meta_key", columnList = "meta_key", unique = false),
		@Index(name = "order_meta_key_order", columnList = "order_id,meta_key", unique = false),
		@Index(name = "order_meta_site", columnList = "order_id,site_id", unique = false)
	}
)
public class OrderMeta extends AbstractEntity{

	private static final long serialVersionUID = 1629958809079003777L;
	
	private static final String PGNAME = "order_meta_";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PGNAME + "generator")
	@SequenceGenerator(name = PGNAME + "generator", sequenceName = PGNAME + "sequence")
	protected Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id")
	private Site site;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Orders order;
	
	@Column(name = "meta_key", nullable = true)
	private String metaKey;
	
	@Column(name = "meta_value", nullable = true, columnDefinition = "text")
	private String metaValue;

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
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return the order
	 */
	public Orders getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Orders order) {
		this.order = order;
	}

	/**
	 * @return the metaKey
	 */
	public String getMetaKey() {
		return metaKey;
	}

	/**
	 * @param metaKey the metaKey to set
	 */
	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}

	/**
	 * @return the metaValue
	 */
	public String getMetaValue() {
		return metaValue;
	}

	/**
	 * @param metaValue the metaValue to set
	 */
	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}
}
