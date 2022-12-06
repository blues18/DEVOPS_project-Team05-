package com.dvops.maven.eclipse;

public class User {
	protected String username;
	public User (String username, String password, String email, String races) {
	super();	
	this.username = username;
	this.password = password;
	this.email = email;
	this.races = races;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getRaces() {
		return races;
	}
	public void setRaces(String races) {
		this.races = races;
	}
	protected String password;
	protected String email;
	protected String races;

}
