package com.luv2code.springdemo;

public class PraticeActivity3_BeanScopesWithXMLConfiguration_CoachImplementation implements Coach{

	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		
		return "praticeactivity3";
	}
	public void callInit() {
		System.out.println("init");
	}
	
	public void callDestroy() {
		System.out.println("Destroy");
	}
}
