package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	
	public static void main (String[] args)
	{
		//Locating the xml file 
		Resource r = new ClassPathResource("resources/spring.xml");
		
		//loading xml into bean factory container 
		BeanFactory f = new XmlBeanFactory(r);
		
		//creating test class object. The id was "t" in our xml file  
		f.getBean("t");
		f.getBean("t");
		f.getBean("t");
		
	}
}
	
