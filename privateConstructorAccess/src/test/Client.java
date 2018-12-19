package test;

//importing constructor class
import java.lang.reflect.Constructor;

public class Client {
	
	public static void main(String[] args)
	{
		try {
			
			//storing the class 'test' in the class type variable
			Class c = Class.forName("beans.Test");
			
			//getDeclaredConstructors gives arrays of constructors in a class. So storing them in an array
			Constructor[] con = c.getDeclaredConstructors();
			
			//making the constructor at index 0 public. 
			con[0].setAccessible(true);
			
			//creating the instance of that constructor.
			con[0].newInstance();
		}
		
		catch(Exception e)
		{
			
		}
	}
}
