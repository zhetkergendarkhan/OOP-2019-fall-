package lab3p2;

public class Cube extends Shape3D {
	private double side;
	private double v;
	private double sA;

	public Cube(double s) {
		side = s;
		sA = 6 * side * side;
		v = side * side * side;
	}

	public void setSide(double sNew) {
		side = sNew;
		sA = 6 * side * side;
		v = side * side * side;
	}

	public double volume() {
		return v;
	}

	public double surfaceArea() {
		return sA;
	}

	public String toString() {
		return "volume of cube = " + v + "\n surfaceArea of cube = " + sA;
	}

}
