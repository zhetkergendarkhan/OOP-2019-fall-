package lab3p3;

import java.util.Objects;

public class Manager extends Employee {
	private double bonus;
	public Manager(String n,double s,int year,int month,int day,String in) {
		super(n,s,year,month,day,in);
		bonus=0;
	}
	public Manager(String n,double s,int year,int month,int day,String in,double b) {
		super(n,s,year,month,day,in);
		bonus=b;
	}
	public void setBonus(double b) {
		bonus=b;
	}
	public double getSalary() {
		 	
		 	return super.getSalary()+bonus;
	}
	public String toString() {
		return super.getName()+" "+getSalary()+" "+super.getHireDay()+" "+super.getInsNum();
	}
	public int hashCode() {
		return Objects.hash(super.getName(),getSalary(),super.getHireDay(),super.getInsNum(),bonus);
	}
	public boolean equals(Object otherObject) {
		if(hashCode()==otherObject.hashCode()) {
			return true;
		}
		if(!(otherObject instanceof Employee)) {
			return false;
		}
		if(!super.equals(otherObject)) {
			return false;
		}
		Manager other=(Manager) otherObject;
		return bonus==other.bonus;
	}

}
