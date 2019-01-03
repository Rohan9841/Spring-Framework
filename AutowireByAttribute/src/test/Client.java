package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowire_autodetect.xml");
		
		Bus carObject = (Bus) ap.getBean("b");
		
		carObject.printDetails();
	}
}
