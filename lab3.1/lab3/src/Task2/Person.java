package Task2;

import java.util.Objects;

public class Person {
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Person))
			return false;
		Person p = (Person)o;
		if (!this.name.equals(p.name))
			return false;
		if (!this.surname.equals(p.surname))
			return false;
		if (this.age != p.age)
			return false;
		return true;
	}
	
	public int hashCode() {
		return Objects.hash(name, surname, age);
	}
	public String toString() {
		return "My name is " + name + ". I am " + age;
	}
}
