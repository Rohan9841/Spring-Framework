package beans;

public class Car {
	private Engine eng;
	
	public void setEngine(Engine e)
	{
		eng = e;
	}
	
	public void printDetails()
	{
		System.out.println("Engine mode: "+eng.getModel());
	}
}
