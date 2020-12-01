package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		// 코드작성
		if ("앱".equals(str)) {
			playApp();
		} else if ("통화".equals(str)) {
			super.execute(str);
		} else if ("음악".equals(str)) {
			download();
		}
	}

	// 메소드작성
	protected void playApp() {
		System.out.println("앱 실행");
	}

	// 메소드작성
	protected void download() {
		System.out.println("다운로드해서 음악 재생");
	}

}
