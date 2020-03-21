
public class Triangle extends Shape{
	int rebro1, rebro2, rebro3;
	
	public Triangle(int x, Color color, int rebro1, int rebro2, int rebro3) {
		super(color, x);
		this.rebro1 = rebro1;
		this.rebro2 = rebro2;
		this.rebro3 = rebro3;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		
		if(color == Color.RED) {
			System.err.print("^");
		}
		else {
			System.out.print("^");
		}
	}
	
	public void draw(char prefix) {
		for(int i = 0; i < x; i++) {
			System.out.print(prefix);
		}
		
		if(color == Color.RED) {
			System.err.print("^");
		}
		else {
			System.out.print("^");
		}
	}
	
	public Boolean IsRavnoStorennyi() {
		if(rebro1 == rebro2 && rebro1 == rebro3) return true;
		return false;
	}
}
