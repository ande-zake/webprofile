package com.ande.webprofile.domain.repository;

import java.util.List;

import com.ande.webprofile.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();
	
	void updateStock(String productId, long noOfUnits);
}
