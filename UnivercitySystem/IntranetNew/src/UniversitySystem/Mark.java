package UniversitySystem;

public class Mark {
	
	private double value;
	private String character;
	
	public Mark(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCharacter() {
		if(value > 95) {
			return "A+";
		}
		else if(value > 90) {
			return "A";
		}
		else if(value > 85) {
			return "B+";
		}
		else if(value > 80) {
			return "B";
		}
		else if(value > 75) {
			return "B-";
		}
		else if(value > 70) {
			return "C+";
		}
		else if(value>65) {
			return "C";
		}
		else if(value>60) {
			return "C-";
		}
		else if(value>55) {
			return "D+";
		}
		else if(value>50) {
			return "D";
		}
		return "F";
	}
	
	public String toString() {
		return value + " " + character;
	}
}
