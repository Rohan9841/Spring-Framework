package beans;

public class Car {
	
	private String carname;
	private Engiene engiene;
	
	public Car()
	{
		System.out.println("CarObject created");
	}
	
	public void setCarName(String carname)
	{
		this.carname = carname;
	}
	
	public void setEngiene(Engiene engiene)
	{
		this.engiene = engiene;
	}
	
	public void printCarInfo()
	{
		System.out.println("Name of the car is: "+carname);
		System.out.println("Model year of engiene is: " + engiene.getModel());
	}
}
