package com.nutcake.pa.entity;

public class User {
	private int id;
	private String uname;
	private String password;
	
	public User(int id, String name,  String password  ){
		this.id = id;	
		this.uname = name;		
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
