
//201202

package com.yedam.interfaces;

interface Runnable {
	public void run(); // run을 반드시 구현해야 함
}

class AutoRun implements Runnable { // Runnable 인터페이스 구현

	@Override
	public void run() {
		System.out.println("자동실행");
	}

}

class NewRun implements Runnable {

	@Override
	public void run() {
		System.out.println("새로운실행");
	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();

		runnable = new NewRun();
		runnable.run();

		// 익명의 구현객체
		// 클래스 이름 없이 유연하게 사용 가능
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명실행");
			}

		};
		runnable.run();

		//람다 표현식
		//간소화
		runnable = () -> System.out.println("또 따른 익명실행");
		
		runnable.run();
	}
}
