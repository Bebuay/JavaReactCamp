package Concrates;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("The named campaign "+campaign.getCampaignName()+" with %"+campaign.getPercentageDiscount()+" discount.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("The named campaign "+campaign.getCampaignName()+" deleted.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("The named campaign "+campaign.getCampaignName()+" updated.");		
	}

}
