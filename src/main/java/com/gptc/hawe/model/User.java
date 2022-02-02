package com.gptc.hawe.model;

// @component is used to annotate compound classes
// @Component are @Service(service), @Controller(presentation), @Repository(Persistence/DAO)
//DAO - data access object

//to test using 'Mockito test'
public class User {
	private int id;
	private String userName;
	private String password;
	                                                                                                             
	
	public User(int id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
