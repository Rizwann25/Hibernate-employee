package com.atmecs.hibernate.operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate.entity.Employee;

public class UpdateEmployee {
	 public void updateRecord() {
	        Scanner scan = new Scanner(System.in);
	        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
	        .buildSessionFactory();
	        Session session = factory.getCurrentSession();
	        try {
	        	session.beginTransaction();
	        	Employee employee = new Employee();
	        	System.out.println("Enter the ID you want to Update");
	        	int id = scan.nextInt();
	        	//employee.setId(id);
	        	session.update(employee);
	        	
	        	session.getTransaction().commit();
	        }
	           catch (SessionException e) {
	        	   
	        }   finally {
	        	session.close();
	        	factory.close();
	        }
	    }
}
