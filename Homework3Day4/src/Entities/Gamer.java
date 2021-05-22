package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	
	private String nationalityId;
	private int gamerId;
	private String firstName;
	private String lastName;
	private String email;
	private int gamerLevel;
	
	public Gamer() {
		
	}

	public Gamer(String nationalityId,int gamerId, String firstName, String lastName, String email, int gamerLevel) {
		this.nationalityId=nationalityId;
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gamerLevel = gamerLevel;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId=nationalityId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGamerLevel() {
		return gamerLevel;
	}

	public void setGamerLevel(int gamerLevel) {
		this.gamerLevel = gamerLevel;
	}
	

}
