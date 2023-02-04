package com.dvops.maven.eclipse;

public class User {

	public User(String username, String password, String email, String races) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.races = races;

		this.username = "2";
		this.password = "2";
		this.email = "2";
		this.races = "2";

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void addUsername(User user) {
		if (username.toString() != username) {
			String.valueOf(user);
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addPassword(User user) {
		if (password.toString() != password) {
			String.valueOf(user);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addEmail(User user) {
		if (email.toString() != email) {
			String.valueOf(user);
		}
	}

	public String getRaces() {
		return races;
	}

	public void setRaces(String races) {
		this.races = races;
	}

	public void addRaces(User user) {
		if (races.toString() != races) {
			String.valueOf(user);
		}
	}

	protected String username;
	protected String password;
	protected String email;
	protected String races;

}