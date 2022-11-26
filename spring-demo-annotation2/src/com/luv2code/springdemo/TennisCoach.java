package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randonFortuneService")
	private Fortuneservice f;
	
	//Constructor injection
//	@Autowired
//	public TennisCoach(Fortuneservice f) {
//		this.f = f;
//	} 
	
	//setter injection
//	@Autowired
//	public void setF(Fortuneservice f) {
//		this.f = f;
//	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoa654654ch";
	}

	

	@Override
	public String getDailyFortune() {
		return f.getFortune();
	}

}
