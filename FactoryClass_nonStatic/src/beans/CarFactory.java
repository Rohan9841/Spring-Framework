package beans;

public class CarFactory {
	
	public String carName;
	
	public void setcarName(String c)
	{
		carName = c;
	}
	
	public Car getCar() throws Exception
	{
		return (Car)Class.forName(carName).newInstance();
	}
}
