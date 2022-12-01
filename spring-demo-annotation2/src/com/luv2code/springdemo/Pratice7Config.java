package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Pratice7Config {
	
	
	@Bean
	public Practice7Fortune f() {
		return new Practice7Fortune();
	}
	
	@Bean
	public Coach c() {
		return new Practive7Coach(f());
	}
}
