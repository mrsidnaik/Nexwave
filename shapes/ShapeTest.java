package shapes;

public class ShapeTest  {

	public static void main(String[] args) {
		Shape box = new Rectangle(20,30);
		box.computeArea();
		box.computePerimeter();
		Shape cube = new Square(20);
		cube.computeArea();
		cube.computePerimeter();
		draw(new Drawing(), box);
		
		
	}
	public static void draw(Drawable d, Shape s) {
		d.draw(s);
	}

}
