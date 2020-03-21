package Task2;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements java.lang.Comparable<Object>{
	
	Vector<Employee> employees;
	
	public Manager(String name, String surname, int age, String insuranceNumber, int salary, int bonus) {
		super(name, surname, age, insuranceNumber, salary, bonus);
		employees = new Vector<Employee>();
	}

	public boolean equals(Object other) {
		if (!super.equals(other))
			return false;
		Manager m = (Manager) other;
		if (!this.employees.equals(m.employees))
			return false;
		return true;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(employees);
	}
	
	public String toString() {
		String s = "";
		for (Employee e : employees) {
			s += e.getName() + " - " + e.getInsuranceNumber() + "\n";
		}
		return s;
	}
}
