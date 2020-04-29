package com.cap.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cap.spring.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, String>{
	public Customer findByUserPass(String username, String password);

}
