package Task1;

public class Dog extends Animal implements Runnable{

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		System.out.println(this.getName() +  " is running with 4 legs");
	}
	

}
