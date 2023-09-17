package com.jbk.service;

import com.jbk.model.Product;

public interface ProductService {
	
	public String saveProduct(Product product);
	public Product getproductById(String productId);
		
	

}
