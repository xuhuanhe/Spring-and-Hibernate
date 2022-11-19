package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoach getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return "CricketCoach getDailyFortune";
	}

}
