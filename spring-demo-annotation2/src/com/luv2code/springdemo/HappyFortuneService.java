package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortuneservice {

	@Override
	public String getFortune() {
		return "get fortune";
	}

}
