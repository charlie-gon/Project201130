
//201202

package com.yedam.interfaces;

//Functional Interface(함수적 인터페이스)
//구현 인터페이스가 하나만 존재

interface Cal {
	public void multi(int num);
}

interface Calculate {
	public void sum(int num1, int num2);
}


public class InterfaceExample2 {
	public static void main(String[] args) {

//		Cal cal = new Cal() {
//
//			@Override
//			public void multi(int num) {
//				int result = num * 2;
//				System.out.println(result);
//			}
//			
//		};
//		cal.multi(3);

		// 람다식 사용
		// 매개변수와 실행구문만 남겨놓음
		// 람다 표현식은 인터페이스 내부에 추상메소드가 하나만 있어야 한다(두 개 있으면 안되요)
		Cal cal = (num) -> {
			int result = num * 2;
			System.out.println(result);
		};
		cal.multi(3);

		// 필요에 따라 유연하게 변경/사용 가능(제곱 구하기)
		cal = (a) -> {
			int result = a * a;
			System.out.println(result);
		};
		cal.multi(3);

		// Calculate 인터페이스

		Calculate calcu = (int num1, int num2) -> {
			System.out.println(num1 + num2);
		};
		calcu.sum(2, 3);
		
		calcu = (a, b) -> {
			System.out.println(a * b);
		};
		calcu.sum(3, 5);
		
		
	}
}
