package beans;

public class Audi implements Car{
	
	@Override
	public void drive()
	{
		System.out.println("Audi speed limit: 100km/hr");
	}
}
