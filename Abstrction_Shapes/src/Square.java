
public class Square extends Shapes{
	
	//private member
	private int side;

	//getter method returning integer value
	public int getSide() {
		return side;
	}

	//setter method returning null value
	public void setSide(int side) {
		this.side = side;
	}

	//Two parameterized constructor
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	//Overridden method performing the calculation of area
	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		return (float)side*side;
	}
	
}
