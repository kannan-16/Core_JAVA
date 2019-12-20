import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Circle\nSquare\nRectangle");
		System.out.println("Enter the shape name");
		String name = sc.nextLine();
		
		if(name.equalsIgnoreCase("Circle"))
		{
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			Shapes s = new Circle(name,radius);
			System.out.print("Area of Circle is "+s.calculateArea());
		}
		else if(name.equalsIgnoreCase("Square"))
		{
			System.out.println("Enter the side");
			int side = sc.nextInt();
			Shapes s = new Square(name,side);
			System.out.print("Area of Square is "+s.calculateArea());
		}
		else if(name.equalsIgnoreCase("Rectangle"))
		{
			System.out.println("Enter the length");
			int length = sc.nextInt();
			System.out.println("Enter the breadth");
			int breadth = sc.nextInt();
			Shapes s = new Rectangle(name,length,breadth);
			System.out.print("Area of Rectangle is "+s.calculateArea());
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
