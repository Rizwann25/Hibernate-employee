package com.atmecs.hibernate.operations;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate.entity.ClassEmployee;

  public class AddEmployee {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ClassEmployee.class).buildSessionFactory();

	Session session = factory.getCurrentSession();

	try {
	session.beginTransaction();
	//add employee to data
	ClassEmployee emp1 = new ClassEmployee (922, "Mohammed", "Rizwan", "SoftwareEngineer", 50000);

	session.save(emp1);
	session.getTransaction().commit();

	}catch (SessionException e) {

	}finally {
	session.close();
	factory.close();
	}
	}

}
