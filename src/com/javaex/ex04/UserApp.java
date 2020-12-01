package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] uArr = new User[3];

		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		User u03 = new Employee("master", "m7788", "운영자", 5000000);

		uArr[0] = u01;
		uArr[1] = u02;
		uArr[2] = u03;

		for (int i = 0; i < uArr.length; i++) {
			uArr[i].showInfo();
		}

		System.out.println("운영자의 월급은 " + ((Employee) uArr[2]).getSalary() + "원 입니다.");

	}

}
