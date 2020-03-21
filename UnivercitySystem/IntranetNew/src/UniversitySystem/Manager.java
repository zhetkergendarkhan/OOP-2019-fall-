package UniversitySystem;

import java.io.Serializable;

public class Manager extends User implements Serializable, Comparable<Manager>{
	
	public Manager(String name, String id, String password) {
		super(name, id, password);
		
	}
	
	

	@Override
	public int compareTo(Manager m) {
		return this.getName().compareTo(m.getName());
	}

}
