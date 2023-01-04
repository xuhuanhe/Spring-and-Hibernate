package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo2 {
	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			Student temp = new Student("xuhuan","he", "xuhuanhe16@gmail.com");
			
			session.save(temp);
			session.getTransaction().commit();
			System.out.println("done");
			
		}finally {
			factory.close();
		}
	}
}
