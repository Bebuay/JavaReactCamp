package Abstract;

import Entities.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
}
