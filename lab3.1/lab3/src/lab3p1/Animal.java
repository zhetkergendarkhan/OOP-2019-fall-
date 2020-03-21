package lab3p1;

public class Animal {
	private String name;

	public Animal() {
		name = "nothing";
	}

	public Animal(String aName) {
		name = aName;

	}

	public void setAnimal(String aName) {
		name = aName;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

}