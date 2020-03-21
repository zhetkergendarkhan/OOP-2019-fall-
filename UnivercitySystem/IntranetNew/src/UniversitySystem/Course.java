package UniversitySystem;

import java.util.Vector;

public class Course {
	private String name;
	private int numberOfCredits;
	
	public Course(String name, int numberOfCredits) {
		this.name = name;
		this.numberOfCredits = numberOfCredits;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}

}
