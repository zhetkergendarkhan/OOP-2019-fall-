package UniversitySystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

public class Admin extends User{
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Database db;

	public Admin(String name, String id, String password) {
		super(name, id, password);
		db = new Database();	
	}
	
	public void deleteUser(String name) throws IOException {
		Vector<User> users;
		users = db.deserialize();
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		users.remove(index);
		db.setUsers(users);
		db.serializeUser(null);
	}
	
	public void registerUserByAdmin(String choice) throws IOException, ClassNotFoundException {
		User user = UserBuilder.getUser(choice);
		System.out.println("User is created");
		giveAccessToSystem(user);
		db.serializeUser(user);
	}
	
	private void giveAccessToSystem(User user) throws IOException {
		
		File file = new File(getFilename());
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("Login: " + user.getName());
		br.newLine();
		br.write("Password: " + user.getPassword());
		br.newLine();
		br.write("Status: " + getStatus(user));
		br.newLine();
		br.close();
		fr.close();
		System.out.println("Access is given!");
	}
	
	private String getStatus(User user) {
		if (user instanceof Student)
			return "Student";
		if (user instanceof Teacher)
			return "Teacher";
		return null;
	}
	
}

