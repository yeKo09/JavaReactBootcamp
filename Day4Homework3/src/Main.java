import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Gamer yekta = new Gamer(1,"Yekta","Büyükkaya","11111111111",LocalDate.of(2000, 1, 28));
		
		GamerManager gamerManager = new GamerManager(new eDevletCheckManager());
		
		gamerManager.register(yekta);
		
		Campaign campaign = new Campaign(1, "Black Friday" , 10.0);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		
		SellGameManager sellGameManager = new SellGameManager();
		
		sellGameManager.sellGame(yekta, new Game(1,"Call of Duty", "Action", 100.0), campaign);
		
		
	}

}
