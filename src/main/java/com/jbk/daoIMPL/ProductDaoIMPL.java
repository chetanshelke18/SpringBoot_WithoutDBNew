package com.jbk.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;

public class ProductDaoIMPL implements ProductDao {

	List<Product> list=new ArrayList();
	@Override
	public String saveProduct(Product product) {
		list.add(product);
		return "product is also saved";
	}

	@Override
	public Product getproductById(String productId) {
		
		return null;
	}

}
