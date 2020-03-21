import java.util.Vector;

public class testShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> shapes = new Vector<Shape>();
		shapes.add(new Square(1, 2, Shape.Color.RED));
		shapes.add(new Circle(10, 2, Shape.Color.BLACK));
		shapes.add(new Triangle(25, Shape.Color.BLACK, 3, 3, 3));
		
		for(Shape shape : shapes) {
			shape.draw();
		}
		
		System.out.println();
		
		for(Shape shape : shapes) {
			if(shape instanceof Circle) {
				Circle c = (Circle) shape;
				c.draw('+');
			}
			else if(shape instanceof Triangle) {
				Triangle t = (Triangle) shape;
				t.draw('-');
			}
			else if(shape instanceof Square) {
				Square s = (Square) shape;
				s.draw('*');
			}
		}
	}

}
