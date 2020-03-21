package lab3p2;

public class Sphere extends Shape3D {
	private double r;
	private double v;
	private double sA;

	public Sphere(double r) {
		this.r = r;
		sA = 4 * Math.PI * r * r;
		v = 4 / 3 * Math.PI * r * r * r;
	}

	public void setRadius(double rNew) {
		r = rNew;
		sA = 4 * Math.PI * r * r;
		v = 4 / 3 * Math.PI * r * r * r;
	}

	public double volume() {
		return v;
	}

	public double surfaceArea() {
		return sA;
	}

	public String toString() {
		return "volume of sphere = " + v + "\n surfaceArea of sphere = " + sA;
	}

}
