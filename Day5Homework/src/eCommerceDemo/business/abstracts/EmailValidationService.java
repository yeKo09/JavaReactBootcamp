package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface EmailValidationService {

	void sendValidationEmail(User user);
	boolean isVerified(User user);
	
	
}
