package Task1;

public abstract class Discipline {
	private String name;
	private final int creditPrice = 50000;
	private int numberOfCredits;
	
	public Discipline(String name, int numOfCredits) {
		this.name = name;
		this.numberOfCredits = numOfCredits;
	}
	
	public int calculateDisciplinePrice() {
		return numberOfCredits * creditPrice;
	}
	
	public int getCreditPrice() {
		return creditPrice;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void getInfo();
}


