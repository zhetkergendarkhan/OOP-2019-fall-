
public class Circle extends Shape {
	int radius;
	
	public Circle(int x, int radius, Color color) {
		super(color, x);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		
		if(color == Color.RED) {
			System.err.print("()");
		}
		else {
			System.out.print("()");
		}
	}
	
	public void draw(char prefix) {
		for(int i = 0; i < x; i++) {
			System.out.print(prefix);
		}
		
		if(color == Color.RED) {
			System.err.print("()");
		}
		else {
			System.out.print("()");
		}
	}
}
