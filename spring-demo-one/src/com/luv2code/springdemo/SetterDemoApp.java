package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		//read the config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//use the bean method
		theCoach.getDailyFortune();
		
		//testing out 
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
	}
}
