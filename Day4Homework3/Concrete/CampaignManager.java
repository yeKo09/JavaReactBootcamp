
public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " kampanyas� eklendi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyas� silindi.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyas� g�ncellendi.");
		
		
	}

}
