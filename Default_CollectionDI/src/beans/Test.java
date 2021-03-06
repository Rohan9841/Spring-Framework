package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set criketers;
	private Map cc;
	
	public void setFruits(List f)
	{
		fruits = f;
	}
	
	public void setCriketers(Set c)
	{
		criketers = c;
	}
	
	public void setCc(Map ccap)
	{
		cc = ccap;
	}
	
	public void printData()
	{
		System.out.println("Fruits............");
		
		for(Object f: fruits)
		{
			System.out.println(f);
		}
		
		System.out.println("Criketers");
		for(Object c: criketers)
		{
			System.out.println(c);
		}
		
		System.out.println("Country and capitals");
		
		for(Object key: cc.keySet())
		{
			System.out.println("Country = "+key+":capital"+cc.get(key));
		}
	}
}


