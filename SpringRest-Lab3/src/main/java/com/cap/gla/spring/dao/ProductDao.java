package com.cap.gla.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.gla.spring.model.Product;



public interface ProductDao extends JpaRepository<Product, Integer> {

}