package com.ea.autoEx.integ.dal.dto;

public class UserVO {
	private Long userId;
	private String name;
	private String psw;
	private String email;
	private int age;
	private boolean isValidate;

	public UserVO() {
	}

	public UserVO(Long userId, String name, String psw, String email, int age,
			boolean isValidate) {
		this.userId = userId;
		this.name = name;
		this.psw = psw;
		this.email = email;
		this.age = age;
		this.isValidate = isValidate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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
}
