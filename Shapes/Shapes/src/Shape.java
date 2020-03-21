
public abstract class Shape {

	enum Color{BLACK, RED};
	int x;
	
	public Color color;
	
	public Shape(Color color, int x) {
		this.color = color;
		this.x = x;
	}
	
	public abstract void draw();
}
