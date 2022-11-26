package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private Fortuneservice f;
//	@Autowired
//	public TennisCoach(Fortuneservice f) {
//		this.f = f;
//	}
	@Autowired
	public void setF(Fortuneservice f) {
		this.f = f;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoa654654ch";
	}

	

	@Override
	public String getDailyFortune() {
		return f.getFortune();
	}

}
