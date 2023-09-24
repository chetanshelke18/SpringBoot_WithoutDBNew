package com.jbk.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;

public class ProductDaoIMPL implements ProductDao {

	List<Product> list=new ArrayList();

	public ProductDaoIMPL() {
		list.add(new Product("1", "xyz", 1, 1, 10, 10));
		list.add(new Product("1", "xyz", 1, 1, 10, 12));
		list.add(new Product("1", "xyz", 1, 1, 10, 15));

	}
	@Override
	public String saveProduct(Product product) {
		list.add(product);
		return "product is also saved";
	}

	@Override
	public Product getproductById(String productId) {
		for(Product product :list) {
			
		if(productId.equals(product.getProductId()))
			return product;
		
		}
		return null;
	}
		
		@Override
		public List<Product> getAllProduct(){
		if(!list.isEmpty()) {
			return list;
		}else {
			return null;
		}
	}

}


