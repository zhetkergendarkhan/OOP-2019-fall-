package UniversitySystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Database {
	
	private static Vector<User> users;
	public static final String allUsers = "C:\\Users\\Daniyar\\eclipse-workspace\\IntranetNew\\src\\UniversitySystem\\users.ser";
	public static final String allOrders = "C:\\Users\\Daniyar\\eclipse-workspace\\IntranetNew\\src\\UniversitySystem\\orders.ser";
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static ObjectInputStream oin;
	
	public Database() {
		users = new Vector<User>();
	}
	
	public void addUser(User user) {
		users.add(user);
	}

	public static Vector<User> getUsers() {
		return users;
	}

	public static void setUsers(Vector<User> users) {
		Database.users = users;
	}
	
	public void serializeUser(User user) throws IOException {
		String filename = allUsers;
		File file = new File(filename);
		Vector<User> users = this.getUsers();
		if (file.exists()) {
		users = deserialize();
		}
		users.add(user);
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			System.out.println("Successful!");
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public Vector<User> deserialize() throws IOException{
		
		Vector<User> users = new Vector<User>();
		String filename = allUsers;
		File file = new File(filename);
		try {
				fis = new FileInputStream(file); 
		        oin = new ObjectInputStream(fis); 
		        users = (Vector<User>) oin.readObject();
		        oin.close();
		        fis.close();
		        
			} catch (Exception e) {
				// TODO: handle exception
			}
		this.setUsers(users);
		return this.getUsers();
	}
	
}

