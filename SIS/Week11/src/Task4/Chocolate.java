package Task4;

public class Chocolate implements Comparable<Chocolate>{
	
	private String name;
	private double weight;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Chocolate o) {
		if (this.weight > o.getWeight())
			return 1;
		if (this.weight < o.getWeight())
			return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "The chocolate is " + name + " with weight of " + weight;
	}
}
