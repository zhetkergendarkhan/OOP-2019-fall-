package Task1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable dog1 = new Dog("Bob");
		Runnable dog2 = new Dog("Steve");
		Runnable dog3 = new Dog("Hatiko");
		ArrayList<Runnable> runningAnimals = new ArrayList<Runnable>();
		runningAnimals.add(dog1);
		runningAnimals.add(dog2);
		runningAnimals.add(dog3);
		for (Runnable animal : runningAnimals) {
			makeAnimalRun(animal);
		}
	
	}
	
	static void makeAnimalRun(Runnable animal) {
		animal.run();
	}

}
