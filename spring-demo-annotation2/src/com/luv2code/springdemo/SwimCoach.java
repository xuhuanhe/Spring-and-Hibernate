package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	private Fortuneservice f;
	@Value("${foo.emailAddress}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
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
