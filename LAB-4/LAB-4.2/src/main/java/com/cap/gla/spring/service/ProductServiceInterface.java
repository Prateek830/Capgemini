package com.cap.gla.spring.service;

import java.util.List;

import com.cap.gla.spring.model.Product;
import com.cap.gla.spring.model.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
