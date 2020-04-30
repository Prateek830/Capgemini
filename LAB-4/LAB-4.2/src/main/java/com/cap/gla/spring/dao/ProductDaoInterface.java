package com.cap.gla.spring.dao;

import java.util.List;

import com.cap.gla.spring.model.Product;
import com.cap.gla.spring.model.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
