package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PraticeActivity2_DependencyInjection_MainProgram {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("pratice2_Coach", Coach.class);
		
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
