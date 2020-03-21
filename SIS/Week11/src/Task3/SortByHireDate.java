package Task3;

import java.util.Comparator;

public class SortByHireDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getYear().compareTo(o2.getYear());
	}

}
