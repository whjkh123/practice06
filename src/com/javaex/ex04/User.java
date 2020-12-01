package com.javaex.ex04;

public class User {

	protected String id;
	protected String psw;
	protected String name;

	public User() {

	}

	public User(String id, String psw, String name) {
		this.id = id;
		this.psw = psw;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + psw + ", 이름: " + name);
	}

}
