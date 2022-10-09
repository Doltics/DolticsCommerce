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
		@Index(name = "order_address_email", columnList = "email", unique = false),
		@Index(name = "order_address_phone", columnList = "phone", unique = false),
		@Index(name = "order_address_site", columnList = "order_id,site_id", unique = false),
		@Index(name = "order_address_type_order", columnList = "address_type,order_id", unique = false)
	}
)
public class OrderAddress extends AbstractEntity{

	private static final long serialVersionUID = -2192778211113630887L;
	
	private static final String PGNAME = "order_address_";

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
	
	@Column(name = "address_type", nullable = false)
	private String addressType;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = true)
	private String lastName;
	
	@Column(name = "company", nullable = true)
	private String company;
	
	@Column(name = "address_primary", nullable = true, columnDefinition = "text")
	private String address1;
	
	@Column(name = "address_secondary", nullable = true, columnDefinition = "text")
	private String address2;
	
	@Column(name = "city", nullable = true)
	private String city;
	
	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "post_code", nullable = true)
	private String postCode;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone", nullable = false)
	private String phone;

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
	 * @return the addressType
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
