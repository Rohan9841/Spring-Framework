package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("e2")
	private Engine eng;
	
	public void printDetails()
	{
		System.out.println("Engine mode: "+eng.getModel());
	}
}
