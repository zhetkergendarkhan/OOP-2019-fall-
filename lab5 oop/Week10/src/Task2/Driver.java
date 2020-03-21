package Task2;

import java.util.Collections;
import java.util.Vector;
public class Driver {

	public static void main(String[] args) {
		Vector<Employee> employees = new Vector<Employee>();
		employees.add(new Employee("Daniyar", "Amangeldi", 20, "18BD141087", 150000, 20000));
		employees.add(new Employee("Pakita", "Shamoi", 27, "12BD12312", 1000000, 250000 ));
		employees.add(new Employee("Vasya", "Pupkin", 24, "14BD4352", 75000, 10000 ));
		employees.add(new Employee("Elon", "Musk", 24, "10LC435432", 1000000, 3000));
		System.out.println("Before sort:");
		for(Employee e : employees)
			System.out.println(e.getName() + " " + e.getSalary() + " " + e.getBonus());
		System.out.println("After sort:");
		Collections.sort(employees);
		for(Employee e : employees)
			System.out.println(e.getName() + " " + e.getSalary() + " " + e.getBonus());
	}

}
