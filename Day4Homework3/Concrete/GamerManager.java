
public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void register(Gamer gamer) {
		
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme baþarýyla kayýt oldu");
		}else {
			System.out.println("Kayýt olma baþarýsýz oldu.Bilgileriniz geçersiz.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " baþarýyla bilgilerini güncelledi.");
		}else {
			System.out.println("Güncelleme baþarýsýz oldu.Bilgileriniz geçersiz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " baþarýyla kaydýný sildi.");
		}else {
			System.out.println("Kayýt silme baþarýsýz oldu.Bilgileriniz geçersiz.");
		}
		
	}

}
