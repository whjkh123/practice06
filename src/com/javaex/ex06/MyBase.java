package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	protected String day;
	protected String night;
	protected String afternoon;

	public MyBase() {

	}

	public MyBase(String day, String night, String afternoon) {
		this.day = day;
		this.night = night;
		this.afternoon = afternoon;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getNight() {
		return night;
	}

	public void setNight(String night) {
		this.night = night;
	}

	public String getAfternoon() {
		return afternoon;
	}

	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤에는 숙면");
	}

	public void service(String state) {
		if (state.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자.");
		} else if (state.equals("밤")) {
			System.out.println("밤에는 숙면");
		} else {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}
	}

}
