package com.javaex.ex04;

public class Employee extends User {

	protected int salary;

	public Employee() {
		
	}

	public Employee(int salary) {
		this.salary = salary;
	}
	
	public Employee(String id, String psw, String name, int salary) {
		super(id, psw, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + psw + ", #이름: " + name + ", 월급: " + salary);
	}

}
