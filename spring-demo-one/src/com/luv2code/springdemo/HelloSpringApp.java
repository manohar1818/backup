package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) throws Exception{
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContent.xml");
		
		// retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		// close the context
		context.close();
		
		
		/*
		 This is used in normal without beans
		 // create the object either TrackCoach
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		 */
		
		

	}

}
