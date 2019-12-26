package shapes;

public class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		super(length, width);
		
	}

	@Override
	public void computeArea() {
		System.out.println("Area = "+(length*width));

	}

	@Override
	public void computePerimeter() {
		System.out.println("Perimetre = "+(2*(length+width)));

	}

}
