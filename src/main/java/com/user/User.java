package com.user;

public class User {
	private int id;
	private String username;
	private String email;
	private String comment;
	
	public User(int id, String username, String email, String comment) {
	
		this.id = id;
		this.username = username;
		this.email = email;
		this.comment = comment;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getComment() {
		return comment;
	}


}
