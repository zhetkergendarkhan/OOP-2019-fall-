package lab3p5;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student(String aName,String aAddress,String pr,int  y,double f) {
		super(aName,aAddress);
		program=pr;
		year=y;
		fee=f;
	}
	public String getProgramm() {
		return program;
	}
	public void setProgramm(String pNew) {
		program=pNew;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year=y;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double f) {
		fee=f;
	}
	public String toString() {
		String p1="Student; "+super.toString()+", program = "+program;
		String p2=", year= "+year+", fee = "+fee;
		return p1+p2;
	}

}
