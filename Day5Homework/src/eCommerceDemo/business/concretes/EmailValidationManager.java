package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EmailValidationService;
import eCommerceDemo.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService{

	@Override
	public void sendValidationEmail(User user) {

		System.out.println("Doðrulama linki " + user.getFirstName() + " " + user.getLastName() + " adlý kullanýcýya gönderildi.");
		
	}

	@Override
	public boolean isVerified(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý linke týklayarak hesabýný aktifleþtirdi.");
		return true;
	}

}
