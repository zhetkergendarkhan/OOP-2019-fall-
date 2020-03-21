package Task2;

import java.util.Objects;

public class Employee extends Person{
	
	private double salary;
	private int year;
	private String insuranceNumber;
	
	public Employee(String name, String surname, int age, String insuranceNumber) {
		super(name, surname, age);
		this.setInsuranceNumber(insuranceNumber);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object other) {
		if (!super.equals(other))
			return false;
		Employee e = (Employee) other;
		if (this.salary != e.salary)
			return false;
		if (this.year != e.year)
			return false;
		if (!this.insuranceNumber.equals(e.insuranceNumber))
			return false;
		return true;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(salary, year, insuranceNumber);
	}

	public String toString() {
		return "I am employee " + this.getName() + " with insurance number " + insuranceNumber;
	}
}
