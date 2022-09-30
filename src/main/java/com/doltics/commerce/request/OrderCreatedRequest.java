package com.doltics.commerce.request;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreatedRequest {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("parent_id")
	private String parentId;
	
	@JsonProperty("number")
	private String number;
	
	@JsonProperty("order_key")
	private String orderKey;
	
	@JsonProperty("created_via")
	private String createdVia;
	
	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("date_created")
	private Date dateCreated;
	
	@JsonProperty("date_modified")
	private Date dateModified;
	
	@JsonProperty("discount_total")
	private String discountTotal;
	
	@JsonProperty("discount_tax")
	private String discountTax;
	
	@JsonProperty("shipping_total")
	private String shippingTotal;
	
	@JsonProperty("shipping_tax")
	private String shippinTax;
	
	@JsonProperty("cart_tax")
	private String cartTax;
	
	@JsonProperty("total")
	private String total;
	
	@JsonProperty("total_tax")
	private String totalTax;
	
	@JsonProperty("prices_include_tax")
	private Boolean pricesIncludeTax;
	
	@JsonProperty("customer_id")
	private Integer customerId;
	
	@JsonProperty("customer_ip_address")
	private String customerIpAddress;
	
	@JsonProperty("customer_user_agent")
	private String customerUserAgent;
	
	@JsonProperty("customer_note")
	private String customerNote;
	
	@JsonProperty("billing")
	private OrderFormDetailsRequest billing;
	
	@JsonProperty("shipping")
	private OrderFormDetailsRequest shipping;
	
	@JsonProperty("payment_method")
	private String paymentMethod;
	
	@JsonProperty("payment_method_title")
	private String paymentMethodTitle;
	
	@JsonProperty("transaction_id")
	private String transactionId;
	
	@JsonProperty("date_paid")
	private Date datePaid;
	
	@JsonProperty("date_completed")
	private Date dateCompleted;
	
	@JsonProperty("cart_hash")
	private String cartHash;
	
	@JsonProperty("meta_data")
	private List<OrderMetaRequest> metadata;
	
	@JsonProperty("line_items")
	private List<OrderLineItemRequest> lineItems;
	
	@JsonProperty("tax_lines")
	private List<OrderTaxRequest> taxLines;
	
	@JsonProperty("shipping_lines")
	private List<OrderShippingLineRequest> shippingLines;
	
	@JsonProperty("fee_lines")
	private List<OrderFeeLineRequest> feeLines;
	
	@JsonProperty("coupon_lines")
	private List<OrderCouponLinesRequest> couponLines;
	
	@JsonProperty("refunds")
	private List<OrderRefundRequest> refunds;
	
	@JsonProperty("set_paid")
	private Boolean setPaid;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
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
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the dateModified
	 */
	public Date getDateModified() {
		return dateModified;
	}

	/**
	 * @param dateModified the dateModified to set
	 */
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	/**
	 * @return the discountTotal
	 */
	public String getDiscountTotal() {
		return discountTotal;
	}

	/**
	 * @param discountTotal the discountTotal to set
	 */
	public void setDiscountTotal(String discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * @return the discountTax
	 */
	public String getDiscountTax() {
		return discountTax;
	}

	/**
	 * @param discountTax the discountTax to set
	 */
	public void setDiscountTax(String discountTax) {
		this.discountTax = discountTax;
	}

	/**
	 * @return the shippingTotal
	 */
	public String getShippingTotal() {
		return shippingTotal;
	}

	/**
	 * @param shippingTotal the shippingTotal to set
	 */
	public void setShippingTotal(String shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * @return the shippinTax
	 */
	public String getShippinTax() {
		return shippinTax;
	}

	/**
	 * @param shippinTax the shippinTax to set
	 */
	public void setShippinTax(String shippinTax) {
		this.shippinTax = shippinTax;
	}

	/**
	 * @return the cartTax
	 */
	public String getCartTax() {
		return cartTax;
	}

	/**
	 * @param cartTax the cartTax to set
	 */
	public void setCartTax(String cartTax) {
		this.cartTax = cartTax;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @return the totalTax
	 */
	public String getTotalTax() {
		return totalTax;
	}

	/**
	 * @param totalTax the totalTax to set
	 */
	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * @return the pricesIncludeTax
	 */
	public Boolean getPricesIncludeTax() {
		return pricesIncludeTax;
	}

	/**
	 * @param pricesIncludeTax the pricesIncludeTax to set
	 */
	public void setPricesIncludeTax(Boolean pricesIncludeTax) {
		this.pricesIncludeTax = pricesIncludeTax;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerIpAddress
	 */
	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	/**
	 * @param customerIpAddress the customerIpAddress to set
	 */
	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}

	/**
	 * @return the customerUserAgent
	 */
	public String getCustomerUserAgent() {
		return customerUserAgent;
	}

	/**
	 * @param customerUserAgent the customerUserAgent to set
	 */
	public void setCustomerUserAgent(String customerUserAgent) {
		this.customerUserAgent = customerUserAgent;
	}

	/**
	 * @return the customerNote
	 */
	public String getCustomerNote() {
		return customerNote;
	}

	/**
	 * @param customerNote the customerNote to set
	 */
	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

	/**
	 * @return the billing
	 */
	public OrderFormDetailsRequest getBilling() {
		return billing;
	}

	/**
	 * @param billing the billing to set
	 */
	public void setBilling(OrderFormDetailsRequest billing) {
		this.billing = billing;
	}

	/**
	 * @return the shipping
	 */
	public OrderFormDetailsRequest getShipping() {
		return shipping;
	}

	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(OrderFormDetailsRequest shipping) {
		this.shipping = shipping;
	}

	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the paymentMethodTitle
	 */
	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	/**
	 * @param paymentMethodTitle the paymentMethodTitle to set
	 */
	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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
	 * @return the metadata
	 */
	public List<OrderMetaRequest> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(List<OrderMetaRequest> metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the lineItems
	 */
	public List<OrderLineItemRequest> getLineItems() {
		return lineItems;
	}

	/**
	 * @param lineItems the lineItems to set
	 */
	public void setLineItems(List<OrderLineItemRequest> lineItems) {
		this.lineItems = lineItems;
	}

	/**
	 * @return the taxLines
	 */
	public List<OrderTaxRequest> getTaxLines() {
		return taxLines;
	}

	/**
	 * @param taxLines the taxLines to set
	 */
	public void setTaxLines(List<OrderTaxRequest> taxLines) {
		this.taxLines = taxLines;
	}

	/**
	 * @return the shippingLines
	 */
	public List<OrderShippingLineRequest> getShippingLines() {
		return shippingLines;
	}

	/**
	 * @param shippingLines the shippingLines to set
	 */
	public void setShippingLines(List<OrderShippingLineRequest> shippingLines) {
		this.shippingLines = shippingLines;
	}

	/**
	 * @return the feeLines
	 */
	public List<OrderFeeLineRequest> getFeeLines() {
		return feeLines;
	}

	/**
	 * @param feeLines the feeLines to set
	 */
	public void setFeeLines(List<OrderFeeLineRequest> feeLines) {
		this.feeLines = feeLines;
	}

	/**
	 * @return the couponLines
	 */
	public List<OrderCouponLinesRequest> getCouponLines() {
		return couponLines;
	}

	/**
	 * @param couponLines the couponLines to set
	 */
	public void setCouponLines(List<OrderCouponLinesRequest> couponLines) {
		this.couponLines = couponLines;
	}

	/**
	 * @return the refunds
	 */
	public List<OrderRefundRequest> getRefunds() {
		return refunds;
	}

	/**
	 * @param refunds the refunds to set
	 */
	public void setRefunds(List<OrderRefundRequest> refunds) {
		this.refunds = refunds;
	}

	/**
	 * @return the setPaid
	 */
	public Boolean getSetPaid() {
		return setPaid;
	}

	/**
	 * @param setPaid the setPaid to set
	 */
	public void setSetPaid(Boolean setPaid) {
		this.setPaid = setPaid;
	}
}
