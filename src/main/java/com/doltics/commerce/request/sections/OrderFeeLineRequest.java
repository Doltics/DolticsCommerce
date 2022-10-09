package com.doltics.commerce.request.sections;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderFeeLineRequest {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("tax_class")
	private String taxClass;
	
	@JsonProperty("tax_status")
	private String taxStatus;
	
	@JsonProperty("total")
	private String total;
	
	@JsonProperty("total_tax")
	private String totalTax;
	
	@JsonProperty("taxes")
	private List<OrderTaxRequest> taxes;
	
	@JsonProperty("meta_data")
	private List<OrderMetaRequest> metaData;

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
	 * @return the taxStatus
	 */
	public String getTaxStatus() {
		return taxStatus;
	}

	/**
	 * @param taxStatus the taxStatus to set
	 */
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
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
}