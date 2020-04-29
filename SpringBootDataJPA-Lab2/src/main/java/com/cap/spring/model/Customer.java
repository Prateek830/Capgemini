package com.cap.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer {
	@Id
	private String username;
	private String password;
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [userName=" + username + ", password=" + password + "]";
	}
	public Customer(String userName, String password) {
		super();
		this.username = userName;
		this.password = password;
	}
	
	

}
