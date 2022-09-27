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
}
