package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TennisCoa654654ch";
	}

}
