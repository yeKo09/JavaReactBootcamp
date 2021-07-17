package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EmailValidationService;
import eCommerceDemo.business.abstracts.UserCheckService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	private EmailValidationService emailValidationService;
	private UserDao userDao;
	
	
	public UserManager(UserCheckService userCheckService, EmailValidationService emailValidationService,UserDao userDao) {
		this.userCheckService = userCheckService;
		this.emailValidationService = emailValidationService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		
		if(this.userCheckService.checkFirstName(user.getFirstName()) && this.userCheckService.checkLastName(user.getLastName()) &&
				this.userCheckService.checkIfEmailUsedBefore(user.getEmailAddress()) &&
				this.userCheckService.checkEmailFormat(user.getEmailAddress()) &&
				this.userCheckService.checkPassword(user.getPassword())) {
			System.out.println("Sn. "+ user.getFirstName() + " " + user.getLastName() + 
					" kaydolmanýzýn ilk adýmý baþarýlý. Gönderilen doðrulama linkine týklayarak üyeliðinizi tamamlayýnýz.");
			this.emailValidationService.sendValidationEmail(user);
			if(this.emailValidationService.isVerified(user)) {
				System.out.println(user.getFirstName() + " " + user.getLastName() +
						" adlý kullanýcý baþarýyla kaydoldu.");
				this.userDao.add(user);
			}
		}else {
			System.out.println("Kaydolma baþarýsýz. Bilgilerinizi tekrar kontrol edin.");
		}
		
	}

	@Override
	public void signIn(User user) {
		
		//User newUser = this.userDao.get(1);
		//Simüle ettiðim için yukarýdaki gibi yazmak istemedim.Simüle etmesem yüksek ihtimalle yukarýdaki gibi olurdu.
		//ve user deðiþkeninin email adresi ile newUser deðiþkeninin email adresini karþýlaþtýrýrdým.
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarýyla giriþ yaptý.");
		
		
	}

}
