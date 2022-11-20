package com.luv2code.springdemo;

public class PraticeActivity2_DependencyInjection_CoachImplementation implements Coach{

	
	private PraticeActivity2_DependencyInjection_FortuneServiceImplementation p;
	public PraticeActivity2_DependencyInjection_CoachImplementation(
			PraticeActivity2_DependencyInjection_FortuneServiceImplementation p) {
		this.p = p;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return p.getFortune();
	}

}
