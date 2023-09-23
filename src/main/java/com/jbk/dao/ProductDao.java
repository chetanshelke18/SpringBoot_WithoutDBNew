package com.jbk.dao;

import java.util.List;

import com.jbk.model.Product;

public interface ProductDao {
	
	public String saveProduct(Product product);
	public Product getproductById(String productId);
	List<Product> getProduct();

}
