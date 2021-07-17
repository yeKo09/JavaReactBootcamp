package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EmailValidationService;
import eCommerceDemo.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService{

	@Override
	public void sendValidationEmail(User user) {

		System.out.println("Do�rulama linki " + user.getFirstName() + " " + user.getLastName() + " adl� kullan�c�ya g�nderildi.");
		
	}

	@Override
	public boolean isVerified(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� kullan�c� linke t�klayarak hesab�n� aktifle�tirdi.");
		return true;
	}

}
