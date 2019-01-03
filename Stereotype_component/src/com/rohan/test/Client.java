package com.rohan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.car.Car;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//We don't have any id of Car class so we use this appropach.
		Car c = (Car) ap.getBean(Car.class);
		
		c.printDetails();
		
	}
}
