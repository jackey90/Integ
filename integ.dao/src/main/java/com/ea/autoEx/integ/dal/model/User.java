package com.ea.autoEx.integ.dal.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final Long serialVersionUID = 267615962690396835L;
	private int userId;
	private String name;
	private String psw;
	private String email;
	private int age;
	private boolean isValidate;

	public User() {
	}

	public User(int userId, String name, String psw, String email, int age,
			boolean isValidate) {
		this.userId = userId;
		this.name = name;
		this.psw = psw;
		this.email = email;
		this.age = age;
		this.isValidate = isValidate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isValidate() {
		return isValidate;
	}

	public void setValidate(boolean isValidate) {
		this.isValidate = isValidate; 
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", psw=" + psw
				+ ", email=" + email + ", age=" + age + ", isValidate="
				+ isValidate + "]";
	}
	
	

}
