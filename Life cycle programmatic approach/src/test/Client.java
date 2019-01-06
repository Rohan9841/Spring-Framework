package test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	
	//Exception may occur because we will call save method from Test class which will interact with 'test' database
	public static void main(String[] args) throws Exception
	{
		//this J2EE container can main lifecycle of the class
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//variable to check if to exectute while loop
		boolean check = true;
		
		while(check)
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter 1 for save and 2 for close");
			
			int i = in.nextInt();
			
			//if the user presses 1
			if(i == 1)
			{
				//get the bean of 'Test' class
				Test t = (Test) cap.getBean("t");
				
				//get the required data from user
				System.out.println("Enter your id");
				int idNum = in.nextInt();
				
				System.out.println("Enter name");
				String nameOfUser = in.next();
				
				System.out.println("Enter email");
				String emailUser = in.next();
				
				System.out.println("Enter password");
				String passwordUser = in.next();
				
				//call save method from test class and pass the user input values
				t.save(idNum, nameOfUser, emailUser, passwordUser);
				 
			}
			
			//if the user presses 2
			else if (i == 2)
			{
				//close the container and set the check to false so that the loop won't run
				cap.close();
				check = false;
			}
		}
	}
}
