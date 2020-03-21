package lab3p1;

public class AnimalTest {
	public static void main(String[] args ) {
		Cat c =new Cat("kisa",5);
		System.out.println(c.toString());
		c.setAnimal("kitty");
		System.out.println(c);
		c.setAnimal("kissa", 6);
		System.out.println(c.toString());
		System.out.println(c.getName());
		System.out.println(c.getAge());
	}

}
