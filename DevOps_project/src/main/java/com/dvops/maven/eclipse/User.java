package com.dvops.maven.eclipse;

public class User {
	protected String name;
	public User (String name, String password, String email, String race) {
	super();	
	this.name = name;
	this.password = password;
	this.email = email;
	this.race = race;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	protected String password;
	protected String email;
	protected String race;

}
