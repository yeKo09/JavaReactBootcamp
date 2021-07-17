package eCommerceDemo.core;

import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.google.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService{

	@Override
	public void signUpWithGoogle(User user) {
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(user.getFirstName() + " " + user.getLastName());
		
	}

}
