package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main (String[] args)
	{	
		//check xml file and create object if the scope is singleton
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//creating test class object if the scope is prototype  
		ap.getBean("t");
		ap.getBean("t");
		ap.getBean("t");
		
	}
}
	
