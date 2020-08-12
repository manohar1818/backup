package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext path=
				new ClassPathXmlApplicationContext("4.xml");
		
		CricketCoach cricketcoach = path.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(cricketcoach.getDailyWorkout());
		
		System.out.println(cricketcoach.getDailyFortune());
		
		System.out.println(cricketcoach.getEmailAddress());
		
		System.out.println(cricketcoach.getTeam());
		path.close();

	}

}
