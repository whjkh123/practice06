package com.javaex.ex04;

public class Customer extends User {

	protected int point;

	public Customer() {

	}

	public Customer(int point) {
		this.point = point;
	}

	public Customer(String id, String psw, String name, int point) {
		super(id, psw, name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + psw + ", #이름: " + name + ", 포인트: " + point);
	}

}
