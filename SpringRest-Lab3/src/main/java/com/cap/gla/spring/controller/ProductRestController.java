package com.cap.gla.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.gla.spring.model.Product;
import com.cap.gla.spring.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getAllProduct() {
		return productService.product();
	}

}