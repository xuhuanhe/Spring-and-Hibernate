package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach thecoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach == thecoach);
		System.out.println(coach.getDailyFortune());
		
	}
}
