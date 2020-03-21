package lab3p3;

import java.util.Objects;

public class Person {
	private String name;
	public Person() {
		name="none";
	}
	public Person(String aName) {
		name=aName;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public int hashCode() {
		return Objects.hash(name);
	}
	public boolean equals(Object otherObject) {
		if(hashCode()==otherObject.hashCode()) {
			return true;
		}
		Person other =(Person) otherObject;
		return this==otherObject
				&& (otherObject!=null)
				&& (getClass() == otherObject.getClass())
				&& name==other.name;
	}
	public String toString() {
		return name;
	}

}
