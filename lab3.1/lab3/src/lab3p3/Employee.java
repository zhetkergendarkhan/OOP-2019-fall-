package lab3p3;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
	private double salary;
	private final LocalDate hireDay;
	private String insuranceNumber;
	public Employee(String aName,double sal,int year,int month,int day,String in) {
		super(aName);
		salary=sal;
		 hireDay = LocalDate.of(year, month, day);
		 insuranceNumber=in;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		salary=s;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void setInsNum(String i) {
		insuranceNumber=i;
	}
	public String getInsNum() {
		return insuranceNumber;
	}
	public String toString() {
		return super.toString()
				+", "+salary
				+", "+hireDay
				+", "+insuranceNumber;
	}
	public int hashCode() {
		return Objects.hash(super.getName(),salary,hireDay,insuranceNumber);
	}
	public boolean equals(Object otherObject) {
		if(hashCode()==otherObject.hashCode()) {
			return true;
		}
		if(!(otherObject instanceof Person)) {
			return false;
		}
		if(!super.equals(otherObject)) {
			return false;
		}
		Employee other=(Employee) otherObject;
		return salary==other.salary
				&& hireDay==other.hireDay
				&& insuranceNumber==other.insuranceNumber;
	}

}
