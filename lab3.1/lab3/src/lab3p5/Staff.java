package lab3p5;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String aName,String aAddress,String sc,double f) {
		super(aName,aAddress);
		school=sc;
		pay=f;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String s) {
		school=s;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double p) {
		pay=p;
	}
	public String toString() {
		return "Staff; "+super.toString()+", school = "+school+", pay = "+pay;
	}
	

}
