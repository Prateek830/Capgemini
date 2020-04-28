package com.org.lab1.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.lab1.employee.Employee;
import com.org.lab1.employee.service.interfa.EmployeeServiceInterface;
import com.org.lab1.employeeService.EmployeeService;

public class Main {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.org.lab1");
		context.refresh();
		 Scanner s=new Scanner(System.in);
		  System.out.println("Enter the Employee ID number");
		  int id= s.nextInt();
		  
		  EmployeeServiceInterface service= context.getBean(EmployeeService.class);
		  Employee emp= service.getEmpById( id);
		  
		  if(emp!=null)
		  {
			  System.out.println("Employee Info for Employee ID "+id+":");
			  System.out.println("Employee ID"+" ="+ emp.getId());
			  System.out.println("Employee Name"+" ="+ emp.getName());
			  System.out.println("Employee Salary"+" ="+ emp.getSalary());
		  }
		  else
		  {
			  System.out.println("Invalid ID");
		  }
	}
}
