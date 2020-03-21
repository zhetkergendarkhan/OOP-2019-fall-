package lab3p3;

public class EmpTest {
	public static void main(String[] args ) {
		Manager boss= new Manager("Ferguson",300000,2009,1,5,"K321EW");
		boss.setBonus(22222);
		Employee[] staff = new Employee[4];
		staff[0]=boss;
		staff[1]=new Employee("Muller",120000,2012,5,14,"Y517KZ");
		staff[2]=new Employee("Lewandowski",140000,2011,4,23,"ZG132S");
		staff[3]=new Employee("Ferguson",322222,2009,1,5,"K321EW");
		for(Employee e:staff) {
			System.out.println(e.toString());
		}
		System.out.println(boss.equals(staff[3]));
		System.out.println(boss.hashCode()+" "+staff[3].hashCode());
		System.out.println(boss.equals(staff[0]));
		System.out.println(boss.hashCode()+" "+staff[0].hashCode());
		
		
		
		
	}
	
	

}
