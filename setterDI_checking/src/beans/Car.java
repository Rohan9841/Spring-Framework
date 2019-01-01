package beans;

public class Car {
	
	private String carname;
	private Engine engine;
	
	public void setCar(String c)
	{
		carname = c;
	}
	
	public void setEngine(Engine e)
	{
		engine = e;
	}
	
	public void printDetails()
	{
		System.out.println("Carname is: "+carname);
		System.out.println("Engine is: "+ engine.getModel());
	}
}
