package com.dvops.maven.eclipse;

public class User {


	public User(String name, String password, String email, String races) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.races = races;

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