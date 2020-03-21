package lab3p5;

public class Person {
	private String name;
	private String address;
	
	public Person(String n,String a) {
		name=n;
		address=a;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAdr) {
		address=newAdr;
	}
	public String toString() {
		return name+", "+address;
	}
	

}
