package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	
	private Fortuneservice f;
	
	public SwimCoach(Fortuneservice f) {
		this.f = f;
	}

	@Override
	public String getDailyWorkout() {
		return "SwimCoach getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return f.getFortune();
	}

}
