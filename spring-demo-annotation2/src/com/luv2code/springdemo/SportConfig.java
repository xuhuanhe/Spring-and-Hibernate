package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

	
	@Bean
	public Fortuneservice f() {
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		SwimCoach s = new SwimCoach(f());
		return s;
	}
}
