package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Object>{
	
	private String carName;
	
	public void setcarName(String c)
	{
		this.carName = c;
	}
	
	public Object getObject() throws Exception
	{
		return (Car) Class.forName(carName).newInstance();
	}
	
	public Class<Car> getObjectType()
	{
		return Car.class;
	}
	
	public boolean isSingleton()
	{
		return true;
	}
}
