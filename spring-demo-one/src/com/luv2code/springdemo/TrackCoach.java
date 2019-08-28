package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
	
	//add the init method
	public void doMyStartupStuff() {
		System.out.println("Inside method: doMyStartupStuff()");
	}
	
	//add the destroy method
	public void doMyCleanupStuffYoyo() {
		System.out.println("Inside Method: doMyCleanupStuffYoyo()");
	}
}
