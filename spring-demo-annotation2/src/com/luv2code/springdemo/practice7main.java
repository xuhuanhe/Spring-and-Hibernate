package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practice7main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Pratice7Config.class);
		
		Coach c = context.getBean("c", Practive7Coach.class);
		
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
	}
}
