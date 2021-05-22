package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int campaignId;
	private String campaignName;
	private String startDate;
	private String endDate;
	private int  percentageDiscount;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, String campaignName, String startDate, String endDate, int percentageDiscount) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.percentageDiscount = percentageDiscount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(int percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	
	
}
