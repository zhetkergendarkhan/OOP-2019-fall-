
public class Square extends Shape{
	int length;
	public Square(int x, int length, Color color) {
		super(color, x);
		this.length = length;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		
		if(color == Color.RED) {
			System.err.print("[]");
		}
		else {
			System.out.print("[]");
		}
	}
	
	public void draw(char prefix) {
		for(int i = 0; i < x; i++) {
			System.out.print(prefix);
		}
		
		if(color == Color.RED) {
			System.err.print("[]");
		}
		else {
			System.out.print("[]");
		}
	}
}
