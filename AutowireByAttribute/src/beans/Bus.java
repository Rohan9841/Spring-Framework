package beans;

public class Bus {
	
	public Engine e;
	
//	public Bus()
//	{
//		System.out.println("Default constructor");
//	}
	
	public Bus(Engine eng)
	{
		System.out.println("Parameterized constructor");
		e = eng;
	}
	
	public void setEng(Engine en)
	{
		e = en;
	}
	
	public void printDetails() {
		System.out.println("Bus engine modelYear: "+e.getModel());
	}
}
