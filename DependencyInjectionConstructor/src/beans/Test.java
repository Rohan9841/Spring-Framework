package beans;

public class Test {
	
	private String name = "";
	private int age = 0;
	private String email = "";
	
	
	//Creating constructors with different parameters 
	public Test(String n)
	{
		name = n;
	}
	
	public Test(int age)
	{
		this.age = age;
	}
	
	public Test(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public Test(String n, int a, String e)
	{
		name = n;
		age = a;
		email = e;
	}
	
	public void printHello()
	{
		System.out.println("Hello "+ name);
		System.out.println("Hello your age is: "+ age);
		System.out.println("Hello your email is: "+ email);
	}
}
