package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			Instructor temp = new Instructor("xuhuan", "He", "xuhuanhe16@gmail.com");
			InstructorDetail tempD = new InstructorDetail("youtube", "lov2 code!!");
			
			//associate the object
			temp.setInstructorDetail(tempD);
			// start a transaction
			session.beginTransaction();
			
			System.out.println("saving instructor:" + temp);
			session.save(temp);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





