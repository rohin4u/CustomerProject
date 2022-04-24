package com.spiderscrawl.repository;

import java.util.List;

import com.spiderscrawl.module.Product;

public interface ProductRepository {
	
	public String addProduct(Product product);
	
	public Product findProductById(int id);
	
	public List<Product> findAllProduct();
	
	public String deleteProduct(int id);
	

}
