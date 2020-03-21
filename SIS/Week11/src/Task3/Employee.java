package Task3;

import java.util.Objects;
import Task2.Person;
import java.util.Date;

public class Employee extends Person implements Comparable<Object>, Cloneable{
	private double salary;
	private Date year;
	private String insuranceNumber;
	private double bonus;
	
	public Employee(String name, String surname, int age, String insuranceNumber, int salary, int bonus, Date year) {
		super(name, surname, age);
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
		this.bonus = bonus;
		this.year = year;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {

		this.insuranceNumber = insuranceNumber;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
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
		return "I am employee " + this.getName() + " with insurance number " + insuranceNumber + " Salary: " + salary + " Bonus: " + bonus;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.salary < e.salary)
			return -1;
		if (this.salary > e.salary)
			return 1;
		
			if (this.bonus > e.bonus)
				return 1;
			if (this.bonus < e.bonus)
				return -1;
		
		return 0;
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee clone = (Employee)super.clone();
		clone.year = (Date)year.clone();
		return clone;
	}
}
