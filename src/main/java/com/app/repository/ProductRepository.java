package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	interface ViewA{
		String getProdCode();
		String getProdModel();
	}
	
	
	interface ViewB{
		String getProdVendor();
		Double getProdCost();
	}
	
	List<ViewA> findByProdCost(Double prodCost);
	List<ViewB> findByProdVendor(String prodVendor);
}
