
public class UserManager {

	private BaseLogIn login;
	
	public UserManager(BaseLogIn login) {
		this.login = login;
	}
	
	public void loginToSystem(User user) {
		login.logIn(user);
	}
	
	
}
