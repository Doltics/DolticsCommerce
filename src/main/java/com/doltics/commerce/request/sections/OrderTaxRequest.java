package com.doltics.commerce.request.sections;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderTaxRequest {
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("rate_code")
	private String rateCode;
	
	@JsonProperty("rate_id")
	private String rateId;
	
	@JsonProperty("label")
	private String label;
	
	@JsonProperty("compound")
	private Boolean compound;
	
	@JsonProperty("tax_total")
	private String taxTotal;
	
	@JsonProperty("shipping_tax_total")
	private String shippingTaxTotal;
	
	@JsonProperty("meta_data")
	private List<OrderMetaRequest> metaData;

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
	 * @return the rateCode
	 */
	public String getRateCode() {
		return rateCode;
	}

	/**
	 * @param rateCode the rateCode to set
	 */
	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	/**
	 * @return the rateId
	 */
	public String getRateId() {
		return rateId;
	}

	/**
	 * @param rateId the rateId to set
	 */
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the compound
	 */
	public Boolean getCompound() {
		return compound;
	}

	/**
	 * @param compound the compound to set
	 */
	public void setCompound(Boolean compound) {
		this.compound = compound;
	}

	/**
	 * @return the taxTotal
	 */
	public String getTaxTotal() {
		return taxTotal;
	}

	/**
	 * @param taxTotal the taxTotal to set
	 */
	public void setTaxTotal(String taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * @return the shippingTaxTotal
	 */
	public String getShippingTaxTotal() {
		return shippingTaxTotal;
	}

	/**
	 * @param shippingTaxTotal the shippingTaxTotal to set
	 */
	public void setShippingTaxTotal(String shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
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

}