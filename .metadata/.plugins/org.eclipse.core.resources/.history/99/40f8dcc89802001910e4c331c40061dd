package beans;

public class Car {

	private String[] carname;
	private Engine[] eng;

	public Car() {
		System.out.println("Car object created");
	}

	public void setCarname(String[] cName) {
		carname = cName;
	}

	public void setEngine(Engine[] e) {
		eng = e;
	}

	public void printCarDetails() {
		for (String each : carname) {
			System.out.println("car name: " + each);
		}

		for (Engine each : eng) {
			System.out.println("Engine model: " + each.getModelyear());
		}
	}
}
