package Task2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Darkhan", "Zhetkergen", 20, "18BD");
		Employee e2 = new Employee("Thomas", "Muller", 35, "39UK");
		Employee e3 = new Employee("Pakita", "Shamoi", 27, "12BD");
		Employee e4 = new Employee("Darkhan", "Zhetkergen", 20, "18BD");
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		for (Employee e : hs) {
			System.out.println(e);
		}
		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
	}

}
