package com.jbk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController {
	
	ProductService service=new ProductServiceIMPL();
	Product product=null;
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		
		product.setProductId(UUID.randomUUID().toString());
    String msg = service.saveProduct(product);
    System.out.println(product);
		return msg;
		
	}
	@GetMapping("/get-allproduct")
	public List<Product>getAllProduct(){
		List<Product>list=new ArrayList<>();
		list=service.getAllProduct();
		return list;
	}
   @RequestMapping("/get-singleproduct")
   public Product getProductById(@RequestParam String productId) {
	  Product product=service.getproductById(productId);
	   return product;
   }
}
