package beans;

import java.util.Vector;
import java.util.Hashtable;
import java.util.TreeSet;


public class Test {
	
	private Vector fruits;
	private TreeSet criketers;
	private Hashtable cc;
	
	public Test()
	{
		System.out.println("Test Object created");
	}
	
	public void setFruits(Vector f)
	{
		fruits = f;
	}
	
	public void setCriketers(TreeSet c)
	{
		criketers = c;
	}
	
	public void setCcapital(Hashtable cCap)
	{
		cc = cCap;
	}
	
	public void printDetails()
	{
		System.out.println("Fruits-------------------");
		
		for(Object each: fruits)
		{
			System.out.println(each);
		}
		
		System.out.println("Criketers-----------");
		
		for(Object each: criketers)
		{
			System.out.println(each);
		}
		
		System.out.println("Countries and capitals----------");
		
		for(Object each: cc.keySet()) {
			System.out.println("Country: "+each+"--> Capital: "+cc.get(each));
		}
	}
}
