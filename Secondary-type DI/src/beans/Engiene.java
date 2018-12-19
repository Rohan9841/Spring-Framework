package beans;

public class Engiene {

	private String modelYear;
	
	
	public Engiene()
	{
		System.out.println("Engiene Object created");
	}
	
	public void setModel(String modelYear)
	{
		this.modelYear = modelYear;
	}
	
	public String getModel()
	{
		return modelYear;
	}
}
