package UniversitySystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public abstract class User implements Serializable {
	
	private final static String filename = "C:\\Users\\Daniyar\\eclipse-workspace\\IntranetNew\\src\\UniversitySystem\\login_password.txt";
	private String name;
	private String id;
	private String password;
	
	public User(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static String getFilename() {
		return filename;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + "]";
	}

	public static String login(String login, String password) {
		String status = null;
		boolean ok = false;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
			      if (line.equals("Login: " + login)) {
			    	  ok = true;
			    	  break;
			      }
//			      reader.readLine();
				}
			if (ok) {
				if (reader.readLine().equals("Password: " + password)) {
					System.out.println("Successful!");
				}
				else {
					System.out.println("Incorrect password");
					System.exit(0); ;
				}
			}
			else System.out.println("No such user!");
			status = reader.readLine();
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
	