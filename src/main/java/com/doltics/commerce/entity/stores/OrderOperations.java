package com.doltics.commerce.entity.stores;

import java.util.Date;

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
		@Index(name = "order_address_email", columnList = "email", unique = false),
		@Index(name = "order_address_phone", columnList = "phone", unique = false),
		@Index(name = "order_address_site", columnList = "order_id,site_id", unique = false),
		@Index(name = "order_address_type_order", columnList = "address_type,order_id", unique = false)
	}
)
public class OrderOperations extends AbstractEntity{

	private static final long serialVersionUID = -1737292182807026728L;
	
	private static final String PGNAME = "order_operations_";

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
	
	@Column(name = "created_via", nullable = true)
	private String createdVia;
	
	@Column(name = "prices_include_tax", nullable = false, columnDefinition = "boolean default false")
	private boolean pricesIncludeTax;
	
	@Column(name = "coupon_usage_counted", nullable = false, columnDefinition = "boolean default false")
	private boolean couponUsageCounted;
	
	@Column(name = "download_permission_granted", nullable = false, columnDefinition = "boolean default false")
	private boolean downloadPermissionGranted;
	
	@Column(name = "cart_hash", nullable = true)
	private String cartHash;
	
	@Column(name = "new_order_email_Sent", nullable = false, columnDefinition = "boolean default false")
	private boolean newOrderEmailSent;
	
	@Column(name = "order_key", nullable = true)
	private String orderKey;
	
	@Column(name = "order_Stock_reduced", nullable = false, columnDefinition = "boolean default false")
	private boolean orderStockReduced;
	
	@Column(name = "date_paid", nullable = true)
	private Date datePaid;
	
	@Column(name = "date_completed", nullable = true)
	private Date dateCompleted;
	
	@Column(name = "shipping_tax", nullable = true)
	private Double shippingTax;
	
	@Column(name = "shipping_total", nullable = true)
	private Double shippingTotal;
	
	@Column(name = "discount_tax", nullable = true)
	private Double discountTax;
	
	@Column(name = "discount_total", nullable = true)
	private Double discountTotal;
	
	@Column(name = "recorded_sales", nullable = false, columnDefinition = "boolean default false")
	private boolean recordedSales;

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
	 * @return the createdVia
	 */
	public String getCreatedVia() {
		return createdVia;
	}

	/**
	 * @param createdVia the createdVia to set
	 */
	public void setCreatedVia(String createdVia) {
		this.createdVia = createdVia;
	}

	/**
	 * @return the pricesIncludeTax
	 */
	public boolean isPricesIncludeTax() {
		return pricesIncludeTax;
	}

	/**
	 * @param pricesIncludeTax the pricesIncludeTax to set
	 */
	public void setPricesIncludeTax(boolean pricesIncludeTax) {
		this.pricesIncludeTax = pricesIncludeTax;
	}

	/**
	 * @return the couponUsageCounted
	 */
	public boolean isCouponUsageCounted() {
		return couponUsageCounted;
	}

	/**
	 * @param couponUsageCounted the couponUsageCounted to set
	 */
	public void setCouponUsageCounted(boolean couponUsageCounted) {
		this.couponUsageCounted = couponUsageCounted;
	}

	/**
	 * @return the downloadPermissionGranted
	 */
	public boolean isDownloadPermissionGranted() {
		return downloadPermissionGranted;
	}

	/**
	 * @param downloadPermissionGranted the downloadPermissionGranted to set
	 */
	public void setDownloadPermissionGranted(boolean downloadPermissionGranted) {
		this.downloadPermissionGranted = downloadPermissionGranted;
	}

	/**
	 * @return the cartHash
	 */
	public String getCartHash() {
		return cartHash;
	}

	/**
	 * @param cartHash the cartHash to set
	 */
	public void setCartHash(String cartHash) {
		this.cartHash = cartHash;
	}

	/**
	 * @return the newOrderEmailSent
	 */
	public boolean isNewOrderEmailSent() {
		return newOrderEmailSent;
	}

	/**
	 * @param newOrderEmailSent the newOrderEmailSent to set
	 */
	public void setNewOrderEmailSent(boolean newOrderEmailSent) {
		this.newOrderEmailSent = newOrderEmailSent;
	}

	/**
	 * @return the orderKey
	 */
	public String getOrderKey() {
		return orderKey;
	}

	/**
	 * @param orderKey the orderKey to set
	 */
	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}

	/**
	 * @return the orderStockReduced
	 */
	public boolean isOrderStockReduced() {
		return orderStockReduced;
	}

	/**
	 * @param orderStockReduced the orderStockReduced to set
	 */
	public void setOrderStockReduced(boolean orderStockReduced) {
		this.orderStockReduced = orderStockReduced;
	}

	/**
	 * @return the datePaid
	 */
	public Date getDatePaid() {
		return datePaid;
	}

	/**
	 * @param datePaid the datePaid to set
	 */
	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}

	/**
	 * @return the dateCompleted
	 */
	public Date getDateCompleted() {
		return dateCompleted;
	}

	/**
	 * @param dateCompleted the dateCompleted to set
	 */
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	/**
	 * @return the shippingTax
	 */
	public Double getShippingTax() {
		return shippingTax;
	}

	/**
	 * @param shippingTax the shippingTax to set
	 */
	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	/**
	 * @return the shippingTotal
	 */
	public Double getShippingTotal() {
		return shippingTotal;
	}

	/**
	 * @param shippingTotal the shippingTotal to set
	 */
	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * @return the discountTax
	 */
	public Double getDiscountTax() {
		return discountTax;
	}

	/**
	 * @param discountTax the discountTax to set
	 */
	public void setDiscountTax(Double discountTax) {
		this.discountTax = discountTax;
	}

	/**
	 * @return the discountTotal
	 */
	public Double getDiscountTotal() {
		return discountTotal;
	}

	/**
	 * @param discountTotal the discountTotal to set
	 */
	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * @return the recordedSales
	 */
	public boolean isRecordedSales() {
		return recordedSales;
	}

	/**
	 * @param recordedSales the recordedSales to set
	 */
	public void setRecordedSales(boolean recordedSales) {
		this.recordedSales = recordedSales;
	}
}
