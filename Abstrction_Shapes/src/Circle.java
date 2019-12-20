
public class Circle extends Shapes{
	
	//private member
	private int radius;

	//getter method returning integer value
	public int getRadius() {
		return radius;
	}

	//setter method returning null value
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//Two parameterized constructor
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	//Overridden method performing the calculation of area 
	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		return (float)Math.PI*radius*radius;
	}
	
}
