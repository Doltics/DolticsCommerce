package com.doltics.commerce.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLineItemRequest {
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("product_id")
	private Integer productId;
	
	@JsonProperty("variation_id")
	private Integer variationId;
	
	@JsonProperty("quantity")
	private Integer quantity;
	
	@JsonProperty("tax_class")
	private String taxClass;
	
	@JsonProperty("subtotal")
	private String subtotal;
	
	@JsonProperty("subtotal_tax")
	private String subtotalTax;
	
	@JsonProperty("total")
	private String total;
	
	@JsonProperty("total_tax")
	private String totalTax;
	
	@JsonProperty("taxes")
	private List<OrderTaxRequest> taxes;
	
	@JsonProperty("meta_data")
	private List<OrderMetaRequest> metaData;
	
	@JsonProperty("sku")
	private String sku;
	
	@JsonProperty("price")
	private String price;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the variationId
	 */
	public Integer getVariationId() {
		return variationId;
	}

	/**
	 * @param variationId the variationId to set
	 */
	public void setVariationId(Integer variationId) {
		this.variationId = variationId;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the taxClass
	 */
	public String getTaxClass() {
		return taxClass;
	}

	/**
	 * @param taxClass the taxClass to set
	 */
	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	/**
	 * @return the subtotal
	 */
	public String getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the subtotalTax
	 */
	public String getSubtotalTax() {
		return subtotalTax;
	}

	/**
	 * @param subtotalTax the subtotalTax to set
	 */
	public void setSubtotalTax(String subtotalTax) {
		this.subtotalTax = subtotalTax;
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
	 * @return the taxes
	 */
	public List<OrderTaxRequest> getTaxes() {
		return taxes;
	}

	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(List<OrderTaxRequest> taxes) {
		this.taxes = taxes;
	}


	/**
	 * @return the metaData
	 */
	public List<OrderMetaRequest> getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData the metaData to set
	 */
	public void setMetaData(List<OrderMetaRequest> metaData) {
		this.metaData = metaData;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

}