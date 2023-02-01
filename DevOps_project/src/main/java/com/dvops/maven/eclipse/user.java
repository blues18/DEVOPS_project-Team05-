package com.dvops.maven.eclipse;
public class user {   
    
	private String Username;
	private String password;
	private String email;
	private String races;
	
	public user(String Username, String password, String email, String races) {
		super();
		this.Username = Username;
		this.password = password;
		this.email = email;
		this.races = races;
		
	}

public String getUsername() {
		return Username;
}
public void setUsername(String Username) {
	this.Username = Username;
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
}
