package beans;

//By default, spring will make carFactory singleton so it will return singleton object. That's why we don't use singleton approach
public class CarFactory_static {
	
	public static String carName;
	
	//method to set the value of carName which will be used in getCar() method 
	public static void setCar(String c)
	{
		CarFactory_static.carName = c;
	}
	
	//method to return the class that implements Car interface - Audi or Honda
	public static Car getCar() throws Exception{
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}
}
