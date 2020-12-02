
//201202

package com.yedam.interfaces;

//원 넓이
interface Circle {
	public void run(int radius);
}

//삼각형
interface Triangle {
	public void sum(int base, int height);
}

//정사각형
interface Square {
	public void num(int length, int width);
}

public class InterfaceExample3 {
	public static void main(String[] args) {

		
		// 원의 넓이 = 반지름 제곱 * 3.14(pi)
		Circle circle = (radius) -> {
			double pi = 3.14;
			System.out.println("원의 넓이: " + (radius*2)*pi);
		};
		circle.run(2);
		
		// 밑변으로 가지는 삼각형의 넓이 = 밑변 * 높이 / 2
		Triangle triangle = (base, height) -> {
			System.out.println((base*height)/2);
		};
		triangle.sum(2, 5);
		
		// 정사각형 넓이 = 가로 * 세로
		Square square = (length, width) -> {
			System.out.println(length*width);
		};
		square.num(2, 5);

	}
}
