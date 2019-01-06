package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		ap.getBean("t");
		Calendar c = (Calendar) ap.getBean("c");
		System.out.println(c.getCalendarType());
	}
}
