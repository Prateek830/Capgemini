package com.cap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.spring.common.NotFoundException;
import com.cap.spring.manager.CustomerManager;
import com.cap.spring.model.Customer;

@RestController
@RequestMapping("/product")
public class CustomerController {

	@Autowired
	private CustomerManager customerManager;

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerManager.getCustomer(id).orElseThrow(() -> new NotFoundException("Product not found with id " + id));
	}

}