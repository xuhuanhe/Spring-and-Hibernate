package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Practice4 implements Coach {

	@Override
	public String getDailyWorkout() {
		return "pract22222ice4";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
