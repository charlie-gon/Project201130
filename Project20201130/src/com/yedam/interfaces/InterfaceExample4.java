
//201203
//MyInterface와 연동

package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		
		MyInterface mi = null;
		
		//매개값의 합
		
		//기존 방식
		mi = new MyInterface() {

			@Override
			public int run(int num1, int num2) {
				return num1 + num2;
			}
			
		};
		int result = mi.run(2, 7);
		
		//위 내용을 람다식으로
		mi = (int num1, int num2) -> {
				return num1 + num2;
			};
			int hello = mi.run(2, 7);
			System.out.println(hello);
			
		//위 내용을 더욱 간소화	
			mi = (a, b) -> a + b;
			int good = mi.run(2, 7);
			System.out.println(good);
			
			
		//두개의 변수(직사각형 가로/세로) -> 넓이를 구현
			mi = (length, width) -> length * width;
			result = mi.run(7, 8);
			System.out.println("직사각형의 넓이: " + result);
//			
//			MyInterface myInterface = (num1, num2) -> {
//				int gg = num1 * num2;
//				System.out.println(gg);
//			};
//			myInterface.run(2,4);
			
			
	}

}
