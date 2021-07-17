package eCommerceDemo;

import eCommerceDemo.business.concretes.EmailValidationManager;
import eCommerceDemo.business.concretes.UserCheckManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.GoogleRegisterManagerAdapter;
import eCommerceDemo.core.GoogleRegisterService;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User(1,"Yekta","Büyükkaya","yekob@gmail.com","123456");
		
		UserManager userManager = new UserManager(new UserCheckManager(), new EmailValidationManager(), new HibernateUserDao());
		
		userManager.signUp(user);
		
		userManager.signIn(user);
		
		GoogleRegisterService abc = new GoogleRegisterManagerAdapter();
		
		abc.signUpWithGoogle(user);

	}

}
