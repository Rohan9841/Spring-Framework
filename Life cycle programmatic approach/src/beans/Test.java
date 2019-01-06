package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//InitializingBean is like init method and DisposableBean is like destroy method
public class Test implements InitializingBean, DisposableBean{
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	private Connection con;
	
	public void setDriver(String d)
	{
		this.driver = d;
	}
	
	public void setUrl(String u)
	{
		this.url = u;
	}
	
	public void setUserName(String un)
	{
		this.userName = un;
	}
	
	public void setPassword(String p)
	{
		this.password = p;
	}
	
	//this will be executed while loading in the J2EE container
	public void afterPropertiesSet() throws Exception
	{
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url, userName,password);
		System.out.println("Connection opened");
	}
	
	//method to save the value that will be input by user into our database
	public void save(int id, String name, String email, String password) throws Exception  
	{
		//PreparedStatement allows to give value dynamically.'?' is a parameter marker which if left empty will give sql exception
		PreparedStatement ps = con.prepareStatement("insert into practice value(?,?,?,?)");
		
		//setxxx is method where xxx is the datatype of the parameter and the number is the order in which the value will be passed
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3, email);
		ps.setString(4, password);
		 
		//this will execute the sql query and give you the total number of rows affected
		ps.executeUpdate();
		
		System.out.println("Insertion success. \n");
	}
	
	//this method will be invoked when the container is closed
	public void destroy() throws Exception
	{
		con.close();
		System.out.println("Connection closed");
	}
}
