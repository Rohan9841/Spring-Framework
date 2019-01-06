package beans;

public class Test {
	
	private static Test t;
	
	private Test()
	{
		System.out.println("Test Object created");
	}
	
	public static Test getInstance()
	{
		if(t == null)
		{
			t = new Test();
			return t;
		}
		return t;
	}
	
	//We need to restrict clonable methods as well so that nobody can directly instantiate test class object
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
