
public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void register(Gamer gamer) {
		
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme ba�ar�yla kay�t oldu");
		}else {
			System.out.println("Kay�t olma ba�ar�s�z oldu.Bilgileriniz ge�ersiz.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " ba�ar�yla bilgilerini g�ncelledi.");
		}else {
			System.out.println("G�ncelleme ba�ar�s�z oldu.Bilgileriniz ge�ersiz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " ba�ar�yla kayd�n� sildi.");
		}else {
			System.out.println("Kay�t silme ba�ar�s�z oldu.Bilgileriniz ge�ersiz.");
		}
		
	}

}
