package com.doltics.commerce.repository.stores;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doltics.commerce.entity.stores.Customer;
import com.doltics.commerce.entity.stores.Site;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findBySite(Site site, Pageable pageable);
	
	Customer findBySiteAndCustomerId(Site site, Long customerId);
	
	Customer findBySiteAndEmail(Site site, String email);
}
