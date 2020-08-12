package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method");
		this.fortuneService = fortuneService;
	}
	
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("CricketCoach: Inside setter method");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: Inside setter method");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
