package beans;

public class Car {

	private String carname;
	private Engine eng;
	
	public Car()
	{
		System.out.println("Car Object created");
	}
	public void setcarname(String cName)
	{
		carname = cName;
	}
	
	public void setEngine(Engine e)
	{
		eng = e;
	}
	
	public void printCarData()
	{
		System.out.println("CarName = "+carname);
		System.out.println("ModelYear= "+eng.getModelyear());
	}
}
