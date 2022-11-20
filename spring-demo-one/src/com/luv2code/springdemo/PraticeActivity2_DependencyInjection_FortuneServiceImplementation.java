package com.luv2code.springdemo;

import java.util.Random;

public class PraticeActivity2_DependencyInjection_FortuneServiceImplementation implements FortuneService{

	private String[] random = new String[] {"a","b", "c"};
	private Random r = new Random();
	@Override
	public String getFortune() {
		return random[r.nextInt(random.length)];
	}

}
