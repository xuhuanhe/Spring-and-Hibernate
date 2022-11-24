package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PraticeActivity3_BeanScopesWithXMLConfiguration_MainProgram {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("pratice3_Coach", Coach.class);
		
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
