package lab3p2;

public class Cylinder extends Shape3D {
	private double radius, height;
	private double sA;
	private double v;

	public Cylinder(double r, double h) {
		radius = r;
		height = h;
		sA = 2 * Math.PI * radius * (radius + height);
		v = Math.PI * radius * radius * height;
	}

	public double volume() {
		return v;
	}

	public void setHeight(double hNew) {
		height = hNew;
		sA = 2 * Math.PI * radius * (radius + height);
		v = Math.PI * radius * radius * height;
	}

	public void setRadius(double rNew) {
		radius = rNew;
		sA = 2 * Math.PI * radius * (radius + height);
		v = Math.PI * radius * radius * height;
	}

	public double surfaceArea() {
		return sA;
	}

	public String toString() {
		return "volume of cylinder = " + v + "\n surfaceArea of cylinder = " + sA;
	}

}
