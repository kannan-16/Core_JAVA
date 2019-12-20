
public abstract class Shapes {
	
	//protected member 
	protected String name;

	//Constructor - one argument
	public Shapes(String name) {
		super();
		this.name = name;
	}

	//getter method returning a string
	public String getName() {
		return name;
	}

	//setter method returning a null value
	public void setName(String name) {
		this.name = name;
	}
	
	abstract float calculateArea();
}
