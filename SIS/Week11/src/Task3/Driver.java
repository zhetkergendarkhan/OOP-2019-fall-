package Task3;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Checking the clone: ");
		checkingClone();
		System.out.println("Checking the comparator: ");
		checkingComparator();
	}
	
	static void checkingComparator() {
		Vector<Employee> v = new Vector<Employee>();
		v.add(new Employee("Daniyar", "Amangeldi", 20, "18BD141087", 150000, 20000, new Date()));
		v.add(new Employee("Aaron", "Black", 20, "18BD141087", 150000, 20000, new Date()));
		v.add(new Employee("Zack", "Schneider", 20, "18BD141087", 150000, 20000, new Date()));
		System.out.println("Before sort by name: ");
		for (Employee e : v)
			System.out.println(e.getName() + " " + e.getSurname());
		System.out.println("After sort by name: ");
		SortByName sbn = new SortByName();
		Collections.sort(v, sbn);
		for (Employee e : v)
			System.out.println(e.getName() + " " + e.getSurname());
	}
	
	static void checkingClone() {
		Employee e1 = new Employee("Daniyar", "Amangeldi", 20, "18BD141087", 150000, 20000, new Date());
		Employee e2 = null;
		try {
			e2 = e1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Employee e3 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("Before change of the name: ");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		System.out.println(e3.getName());
		e1.setName("Elon");
		System.out.println("After change of the name:");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		System.out.println(e3.getName());
	}

}
