package com.capg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.hcs.entity.User;

/****************************
 *          @author          Prateek Pandey
 *          Description      It is a interface that extends the JPA Repository to 
 *          				 use inbuilt functions for JPA. 
                                         
  *         Version          1.0
  *         Created Date     9-May-2020
 ****************************/


public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByEmailId(String emailId);
	public User findByEmailIdAndUserPassword(String emailId, String userPassword); 

}
