package lab3p5;

import lab3p3.Employee;

public class PersonTest {
	public static void main(String[]args) {
		Staff teacher=new Staff("Askar agai","Tole bi 211","Kbtu",90000);
		Student[] s= new Student[3];
		s[0]=new Student("joshua","Tole bi","OOP",2019,300);
		s[1]=new Student("robert","Tole bi","OOP",2019,300);
		s[2]=new Student("thomas","Tole bi","OOP",2019,300);
		Person[] pe=new Person[5];
		pe[0]=teacher;
		pe[1]=s[0];
		pe[2]=s[1];
		pe[3]=s[2];
		pe[4]=new Person("Darkhan","Zhetkergen");
		for(Person p:pe) {
			System.out.println(p);
		}

	}

}
