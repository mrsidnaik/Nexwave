package shapes;

public class Square extends Shape {
	public Square(double length) {
		super(length);
		
	}

	@Override
	public void computeArea() {
		System.out.println("Area = "+(length*length));

	}

	@Override
	public void computePerimeter() {
		System.out.println("Perimetre = "+(4*length));

	}
	
	@Override
	public String toString() {
		return"This is a square";
	}
}
