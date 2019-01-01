package beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public void setDriver(String d)
	{
		driver  = d;
	}
	
	public void setUrl(String u)
	{
		url = u;
	}
	
	public void setUser(String u)
	{
		user = u;
	}
	
	public void setPassword(String p)
	{
		password = p;
	}
	
	public void printConn() throws Exception
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println(con);
	}
}
