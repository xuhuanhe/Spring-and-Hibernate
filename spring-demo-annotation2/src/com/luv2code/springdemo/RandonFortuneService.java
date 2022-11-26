package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandonFortuneService implements Fortuneservice {

	@Override
	public String getFortune() {
		return "randon fortune";
	}

}
