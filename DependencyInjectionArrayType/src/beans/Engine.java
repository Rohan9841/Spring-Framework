package beans;

public class Engine {

	private String modelyear;

	public Engine() {
		System.out.println("Engine object created");
	}

	public void setModelyear(String m) {
		modelyear = m;
	}

	public String getModelyear() {
		return modelyear;
	}
}
