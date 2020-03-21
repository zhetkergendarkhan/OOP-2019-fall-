package UniversitySystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Teacher extends User implements Serializable, java.lang.Comparable<Teacher>{
	
	private Title title;
	private Vector<Course> courses;
	private int rating;
	
	public Teacher(String name, String id, String password, Title title) {
		super(name, id, password);
		this.title = title;
		this.courses = new Vector<Course>();
		rating = 0;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating += rating;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void createOrder() {
		
	}
	
	@Override
	public String toString() {
		return "Teacher [title=" + title + ", courses=" + courses + ", rating=" + rating + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + rating;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Teacher other = (Teacher) obj;
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (rating != other.rating)
			return false;
		if (title != other.title)
			return false;
		return true;
	}

	public void putMark(Student student, String courseName, Mark mark ) {
		HashMap<Course, Mark> grades = student.getGrades();
		for (Map.Entry<Course, Mark> entry : grades.entrySet()) {
		    if (entry.getKey().getName().equals(courseName)) {
		    	grades.replace(entry.getKey(), mark);
		    }
		}
	}

	@Override
	public int compareTo(Teacher o) {
		return this.getName().compareTo(o.getName());
	}
}
