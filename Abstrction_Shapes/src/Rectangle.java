
public class Rectangle extends Shapes{
	
	//Private members of the class Rectangle
	private int length, breadth;

	//getter method for length returning integer
	public int getLength() {
		return length;
	}

	//setter method for length returning null value
	public void setLength(int length) {
		this.length = length;
	}

	//getter method for breadth returning integer 
	public int getBreadth() {
		return breadth;
	}

	//setter method for length returning null value
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	//Three parameterized constructor
	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	//Overridden method performing the calculation of area type casted to float
	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		return (float)length*breadth;
	}
		
}
