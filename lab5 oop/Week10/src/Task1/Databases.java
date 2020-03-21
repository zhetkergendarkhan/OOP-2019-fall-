package Task1;

public class Databases extends Discipline{
	
	private String department;
	private String teacherName;
	private String prereqs;
	
	public Databases(String name, int numOfCredits, String department, String teacherName, String prereqs) {
		super(name, numOfCredits);
		this.department = department;
		this.teacherName = teacherName;
		this.prereqs = prereqs;
	}
	
	@Override
	public void getInfo() {
		System.out.println(getName() + getNumberOfCredits() + department + teacherName + prereqs);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getPrereqs() {
		return prereqs;
	}

	public void setPrereqs(String prereqs) {
		this.prereqs = prereqs;
	}

}
