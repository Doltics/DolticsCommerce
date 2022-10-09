package com.doltics.commerce.request.sections;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderShippingLineRequest {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("method_title")
	private String methodTitle;
	
	@JsonProperty("method_id")
	private String methodId;
	
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
	 * @return the methodTitle
	 */
	public String getMethodTitle() {
		return methodTitle;
	}

	/**
	 * @param methodTitle the methodTitle to set
	 */
	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	/**
	 * @return the methodId
	 */
	public String getMethodId() {
		return methodId;
	}

	/**
	 * @param methodId the methodId to set
	 */
	public void setMethodId(String methodId) {
		this.methodId = methodId;
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