
//201203

package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int maxOrMin(IntBinaryOperator oper) { // 접근제어자를 정의하지 않으면(public ..erc)default값으로 해당 클래스 내에서만 사용 가능
		int result = 0;
		for (int number : scores) {
			result = oper.applyAsInt(result, number);
		}
		return result;
	}

	static int minNum(IntBinaryOperator oper) {
		int result = scores[0];
		for (int number : scores) {
			result = oper.applyAsInt(number, result);

		}
		return result;
	}

	public static void main(String[] args) {

		// 큰 값 리턴
		int maxValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "right: " + right);
				return left > right ? left : right; // left가 right보다 크면 left, 아니면 right 출력
			}

		});
		System.out.println("가장 큰 값: " + maxValue);
		System.out.println();

		// 작은 값 리턴
		int minValue = minNum(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "right: " + right);
				return left > right ? right : left;
			}
		});
		System.out.println("가장 작은 값: " + minValue);
		System.out.println();

	}

}
