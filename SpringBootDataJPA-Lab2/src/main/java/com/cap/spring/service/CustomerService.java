package com.cap.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cap.spring.Dao.CustomerDao;
import com.cap.spring.model.Customer;

@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerDao c;
	
	public Customer findByUserPass(String username,String password) {
		return c.findByUserPass(username, password);
	}
	
}
