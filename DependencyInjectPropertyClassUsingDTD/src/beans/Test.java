package beans;

import java.util.Properties;

public class Test {
	private Properties driver;
	
	public void setDriver(Properties d)
	{
		driver = d;
	}
	
	public void printData()
	{
		//properties is also like map
		for(Object each: driver.keySet())
		{
			System.out.println(each + ": "+driver.getProperty(each.toString())); //converting object type each to string
		}
	}
}
