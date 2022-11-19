package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		//read the config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//
		Coach theCoach = context.getBean("myCricketCoach",Coach.class);
		
		theCoach.getDailyFortune();
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
