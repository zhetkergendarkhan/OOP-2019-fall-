package lab3p2;

public class Shape3DTest {
	public static void main(String[] args) {
		Shape3D cylinder = new Cylinder(1, 4);
		Shape3D cube = new Cube(7);
		Shape3D sphere = new Sphere(6);
		System.out.println(cylinder.toString());
		System.out.println(cube.toString());
		System.out.println(sphere.toString());
		System.out.println(cylinder.volume());
		System.out.println(cylinder.surfaceArea());
		System.out.println(cube.volume());
		System.out.println(cube.surfaceArea());
		System.out.println(sphere.volume());
		System.out.println(sphere.surfaceArea());

	}

}
