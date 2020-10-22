package com.atmecs.hibernate.operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate.entity.ClassEmployee;

public class SaveEmployee {
	 public void saveRecord() {
	        Scanner scan = new Scanner(System.in);
	        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ClassEmployee.class)
	        .buildSessionFactory();
	        Session session = factory.getCurrentSession();
	        try {
	        	session.beginTransaction();
	        	ClassEmployee employee = new ClassEmployee();
	        	System.out.println("Enter the ID you want to Save");
	        	int id = scan.nextInt();
	        //	employee.setId(id);
	        	session.save(employee);
	        	
	        	session.getTransaction().commit();
	        }
	           catch (SessionException e) {
	        	   
	        }   finally {
	        	session.close();
	        	factory.close();
	        }
	    }
}
