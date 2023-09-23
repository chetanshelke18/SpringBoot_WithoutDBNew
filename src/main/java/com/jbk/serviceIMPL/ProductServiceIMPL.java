package com.jbk.serviceIMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.dao.ProductDao;
import com.jbk.daoIMPL.ProductDaoIMPL;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

public class ProductServiceIMPL implements ProductService {
	
ProductDao dao =new ProductDaoIMPL();

	@Override
	public String saveProduct(Product product) {
		String msg = dao.saveProduct(product);
		return msg;
	}

	@Override
	public Product getproductById(String productId) {
		Product product=dao.getproductById(productId);
		return product;
	}
	
	@Override
	public List<Product>getProduct(){
		List<Product>list=new ArrayList<Product>();
		list=dao.getProduct();
		return list;
	}

}
