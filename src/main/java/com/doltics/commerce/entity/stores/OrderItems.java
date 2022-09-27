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
		@Index(name = "order_order_item_id", columnList = "order_item_id", unique = false),
		@Index(name = "order_item_site_order", columnList = "order_item_id,order_id,site_id", unique = false),
		@Index(name = "order_item_site", columnList = "order_id,site_id", unique = false)
	}
)
public class OrderItems extends AbstractEntity{

	private static final long serialVersionUID = 8922036073814096834L;
	
	private static final String PGNAME = "order_item_";
	
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
	
	@Column(name = "order_item_id", nullable = true)
	private String orderItemId;
	
	@Column(name = "order_item_name", nullable = true)
	private String orderItemName;
	
	@Column(name = "order_item_type", nullable = true)
	private String orderItemType;

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
	 * @return the orderItemId
	 */
	public String getOrderItemId() {
		return orderItemId;
	}

	/**
	 * @param orderItemId the orderItemId to set
	 */
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * @return the orderItemName
	 */
	public String getOrderItemName() {
		return orderItemName;
	}

	/**
	 * @param orderItemName the orderItemName to set
	 */
	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

	/**
	 * @return the orderItemType
	 */
	public String getOrderItemType() {
		return orderItemType;
	}

	/**
	 * @param orderItemType the orderItemType to set
	 */
	public void setOrderItemType(String orderItemType) {
		this.orderItemType = orderItemType;
	}
}
