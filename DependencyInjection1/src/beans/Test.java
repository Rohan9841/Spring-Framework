package beans;

public class Test {
	
	String gender;
	
	public void setGender(String g)
	{
		gender = g;
	}
	
	public void hello(String s)
	{
		System.out.println("Hello "+gender+"."+s);
	}
}
