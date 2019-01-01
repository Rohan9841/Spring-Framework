package beans;

public class Car {
	private String carname;
	private Engine engine;
	
	public void setCar(String c)
	{
		carname = c;
	}
	
	public void setEng(Engine e)
	{
		engine = e;
	}
	
	public void printDetails()
	{
		System.out.println("Car name: "+carname);
		System.out.println("Engine mode: "+ engine.getModel());
	}
}
