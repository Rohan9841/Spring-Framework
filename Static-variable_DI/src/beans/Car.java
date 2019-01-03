package beans;

public class Car {
	
	private static String name;
	
	//static method
	public static void setName(String name)
	{
		Car.name = name;
	}
	
	public static void printDetails() {
		System.out.println("Car name: "+name);
	}
}
