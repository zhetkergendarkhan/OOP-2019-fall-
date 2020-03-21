package UniversitySystem;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Student extends User implements Serializable, java.lang.Comparable<Student>{
	
	private String faculty;
	private String specialty;
	private int yearOfStudy;
	private HashMap<Course, Mark> grades;
	
	public Student(String name, String id, String password, String faculty, String specialty, int yearOfStudy) {
		super(name, id, password);
		this.faculty = faculty;
		this.specialty = specialty;
		this.yearOfStudy = yearOfStudy;
	}
	
	public void registerCourse(Course course, Mark mark) {
		grades.put(course, mark);
	}

	public void rateTeacher(Teacher teacher, String rate) {
		if (rate.equals("Positive"))
			teacher.setRating(1);
		else if (rate.equals("Negative"))
			teacher.setRating(-1);
	}
	
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public HashMap<Course, Mark> getGrades() {
		return grades;
	}

	public void setGrades(HashMap<Course, Mark> grades) {
		this.grades = grades;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((grades == null) ? 0 : grades.hashCode());
		result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
		result = prime * result + yearOfStudy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (grades == null) {
			if (other.grades != null)
				return false;
		} else if (!grades.equals(other.grades))
			return false;
		if (specialty == null) {
			if (other.specialty != null)
				return false;
		} else if (!specialty.equals(other.specialty))
			return false;
		if (yearOfStudy != other.yearOfStudy)
			return false;
		return true;
	}

	public void viewGrades() {
		if (this.grades.isEmpty()) {
			System.out.println("You have no courses/grades");
		}
		else {
			for (Map.Entry<Course, Mark> entry : grades.entrySet()) {
			    System.out.println(entry.getKey().getName() + " = " + entry.getValue().getCharacter());
			}
		}
	}

	
	@Override
	public String toString() {
		return "Student [faculty=" + faculty + ", specialty=" + specialty + ", yearOfStudy=" + yearOfStudy + ", grades="
				+ grades + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
	
}
