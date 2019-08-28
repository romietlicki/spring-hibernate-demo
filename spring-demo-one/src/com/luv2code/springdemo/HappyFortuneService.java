package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String [] fortune = {"Today is your lucky day!","Good Morning!","Be Happy!"};
		
		int ramdom = new Random().nextInt(fortune.length);
		
		return fortune[ramdom];
	}

}
