package com.doltics.commerce.request.sections;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCouponLinesRequest {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("discount")
	private String discount;
	
	@JsonProperty("discount_tax")
	private String discountTax;
	
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
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
