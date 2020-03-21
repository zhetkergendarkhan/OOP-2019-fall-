package UniversitySystem;

public class Executor extends User implements java.lang.Comparable{
	
	private Order order;
	
	
	public Executor(String name, String id, String password, Order order) {
		super(name, id, password);
		this.order = order;
	}


	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
	
}
