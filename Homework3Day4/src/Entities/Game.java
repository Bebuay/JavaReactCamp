package Entities;

import Abstract.Entity;

public class Game implements Entity{
	
	private int gameId;
	private String gameName;
	private String gameCategory;
	private int gamePrice;
	
	Game(){
		
	}

	public Game(int gameId, String gameName, String gameCategory, int gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
	
}
