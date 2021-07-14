
public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " kampanyasý eklendi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyasý silindi.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyasý güncellendi.");
		
		
	}

}
