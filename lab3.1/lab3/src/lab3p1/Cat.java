package lab3p1;

public class Cat extends Animal {
	private int c_age;
	
	
	public Cat(int age) {
		super();
		c_age = age;
	}
	
	public Cat(String aName, int age) {
		super(aName);
		c_age = age;
	}
	
	
	public void setAge(int age) {
		c_age = age;
	}
	
	public int getAge() {
		return c_age;
	}
	
	// overloading method 
	
	
		
		
	public void setAnimal(String newname, int age) {
		super.setAnimal(newname);
		c_age = age;
	}
	
	//overriding method
	public String toString() {
		return super.toString()+ " " + "It's age: " + c_age;
	}
	
	
} 