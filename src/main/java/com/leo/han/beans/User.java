package com.leo.han.beans;

import java.io.Serializable;

public class User implements Serializable {
	
	private String username;
	private String age;
	private String comment;
	
	
	public User(){
		
	}


	public User(String username, String age, String comment) {
		super();
		this.username = username;
		this.age = age;
		this.comment = comment;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
