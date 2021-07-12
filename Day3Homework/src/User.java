
public class User {

	private int id;
	private String fullName;
	private String emailAddress;
	private String password;
	
	public User(int id, String fullName, String emailAddress, String password) {
		this.id = id;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
