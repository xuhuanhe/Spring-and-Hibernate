package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private HappyFortuneService fortuneService;
	
	
	public BaseballCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	
}








