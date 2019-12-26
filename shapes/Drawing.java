package shapes;

public class Drawing implements Drawable {

	@Override
	public void draw(Shape s) {
		if(s instanceof Rectangle) {
			System.out.println("Drawing a rectangle");
		}
		
	}

}
