package UniversitySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBuilder {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static User getUser(String choice) throws IOException {
		System.out.print("Enter name: ");
		String name = br.readLine();
		System.out.print("Enter id: ");
		String id = br.readLine();
		System.out.print("Enter password: ");
		String password = br.readLine();
		switch(choice) {
		case "1":
			System.out.print("What is your faculty?: ");
			String faculty = br.readLine();
			System.out.print("What is your specialty?: ");
			String specialty = br.readLine();
			System.out.print("What is your year of study?: ");
			int yearOfStudy = br.read();
			return new Student(name, id, password, faculty, specialty, yearOfStudy);
		case "2":
			System.out.print("What is your title?:\n 1.Tutor \n 2.Lector \n 3.Senior_Lector \n 4.Professor \n");
			int titleInt = br.read();
			Title title = null;
			switch(titleInt) {
			case 1:
				title=Title.Tutor;
				break;
			case 2:
				title=Title.Lector;
				break;
			case 3:
				title = Title.Senior_Lector;
				break;
			case 4:
				title = Title.Professor;
				break;
			default:
					break;
			}
			return new Teacher(name, id, password, title);
		}
		return null;
	}
}
