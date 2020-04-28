package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.org.lab1.employee.*;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(01, "Prateek",33450.0));
		empList.add(new Employee(02,"Pawan",73000.0));
		empList.add(new Employee(03,"Rahul", 46000.0));
		empList.add(new Employee(04,"Yash",25600.0));
		
		return empList;
	}
}
