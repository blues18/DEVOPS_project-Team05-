package com.dvops.maven.eclipse;

import java.util.ArrayList;
import java.util.List;



public class UserCollection {

	 private ArrayList<user> users = new ArrayList<>();
	 private int capacity;

	 public UserCollection() {

	        this.capacity = 20;
	    }
	 public UserCollection(int capacity) {
	        this.capacity = capacity;
	    }
	
	public String getUser (user user) {
		return username;
	}
    public List<user> getUser() {
        return users;
    }
	public void addUser(user user) {
		if(users.size()!= capacity) {
			users.add(user);
		}
	}
	
	//public String getUsername(user user) {
		//return username;
	//}
	
	public List<user> getUsername() {
        return users;
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
  	protected String username;
	protected String password;
	protected String email;
	protected String races;
}