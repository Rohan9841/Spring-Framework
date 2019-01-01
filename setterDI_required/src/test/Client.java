package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.annotation.*;

import beans.Test;

public class Client {
	public static void main(String[] args) throws Exception
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml"); 
		Test c = (Test)ap.getBean("t");
		
		c.printConn();
		
	}
	
}	
