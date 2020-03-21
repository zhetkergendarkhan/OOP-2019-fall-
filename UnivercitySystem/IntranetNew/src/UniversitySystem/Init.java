package UniversitySystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Init {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Admin admin = new Admin("Admin", "Max_Priority", "12345");	
	private static Database db = new Database();
	
	public static void run() throws IOException, ClassNotFoundException {
		System.out.println("Welcome to the Intranet");
		System.out.println("Enter your account details");
		System.out.print("Login: ");
		String login = br.readLine();
		System.out.print("Password: ");
		String password = br.readLine();
		String status = User.login(login, password);
//		System.out.println(status);
		if (status.equals("Status: Admin")) {
			System.out.println("You are admin!");
			System.out.println("Please, select the option: \n 1. Register a user \n 2. Delete user \n 3. Update user");
			String choice = br.readLine();
			switch(choice) {
			case "1": 
				System.out.println("Whom you want to register? \n 1. Student \n 2. Teacher");
				String str = br.readLine();
				admin.registerUserByAdmin(str);
				break;
			case "2":
				System.out.println("Print the name of the user you want to delete: ");
				String temp = br.readLine();
				admin.deleteUser(temp);
				break;
			case "3":
			}
		}
		
		else if (status.equals("Status: Student")) {
			System.out.println("You are student!");
			System.out.println("Please, select the option: \n 1.View marks \n 2.Register on a course");
			String choice = br.readLine();
			Vector<User> v = db.deserialize();
			Student student = null;
			for (User user : v) {
				if (user instanceof Student && user.getName().equals(login)) {
					student = (Student) user;
				}
			}
			switch(choice) {
			case "1":
				student.viewGrades();
				break;
			case "2":
				System.out.print("Enter the name of the course: ");
				String courseName = br.readLine();
				System.out.print("Enter the number of credits of the course: ");
				int num = br.read();
				Course course = new Course(courseName, num);
				student.registerCourse(course, null);
				break;
				
			}
		}
		
		else if (status.equals("Status: Teacher")) {
			System.out.println("You are Teacher!");
			System.out.println("Please, select the option: \n 1.View students \n 2.Put mark on student");
			String choice = br.readLine();
			Vector<User> v = db.deserialize();
			Teacher teacher = null;
			for (User user : v) {
				if (user instanceof Teacher && user.getName().equals(login)) {
					teacher = (Teacher) user;
				}
			}
			switch(choice) {
			case "1":
				
				int cnt = 0;
				for (User user : v)
				{
					if (user instanceof Student) {
						System.out.println(user.getName());
						cnt++;
					}
				}
				if (cnt == 0)
					System.out.println("No students!");
				break;
			case "2":
				System.out.print("Enter the student's name: ");
				String name = br.readLine();
				System.out.print("Enter the course name: ");
				String tmp = br.readLine();
				System.out.print("Enter the mark: ");
				int val = br.read();
				Mark mark = new Mark(val);
				for (User u : v) {
					if (u instanceof Student && u.getName().equals(name)) {
						teacher.putMark((Student)u, tmp, mark);
					}
				}
				break;
			}
		}
	}	
}
