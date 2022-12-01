package com.luv2code.springdemo;

public class Practive7Coach implements Coach{

	private Practice7Fortune p;
	public Practive7Coach(Practice7Fortune p) {
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
