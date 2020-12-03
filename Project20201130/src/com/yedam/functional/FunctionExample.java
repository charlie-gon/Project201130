
//201203
//Student 연동

package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {

	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 96, 92));

	// 학생이름
	// printString 메소드 매개값으로 Function 인터페이스 삽입
	// 인터페이스는 구현이 안되기 때문에 실제 구현을 위해 printString 메소드에 삽입
	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	// 영어점수
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	// 합계
	public static int printSum(ToIntFunction<Student> func) {
		int result = 0, sum = 0;
		for (Student score : list) {
			result = func.applyAsInt(score);
			sum += result;
		}
		return sum;
	}

	// 평균
	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for (Student student : list) {
			func.applyAsDouble(student);
			result = func.applyAsDouble(student);
			sum += result;
		}
		return sum / list.size();
	}

	public static void main(String[] args) {

		// Function
		Function<String, Integer> func = null;

		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) { // 리턴값 Integer / 입력값 String
				return t.length(); // 입력 문자열의 크기 반환
			}

		};
		System.out.println(func.apply("Hello World"));

		// BiFunction
		BiFunction<String, String, Integer> biFunc = null; // 매개값 2개 받고 Integer로 반환

		// 학생 이름

		System.out.println("학생이름");
		printString(new Function<Student, String>() { // 매개값 Student, 리턴값 String

			@Override
			public String apply(Student t) {
				return t.getName();
			}

		});

		System.out.println("영어점수");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		});

		System.out.println("학생이름 + 영어점수");
		// 간소화
		printString(t -> t.getName() + " - " + t.getEngScore());

		System.out.println("합계점수");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {

				return value.getEngScore() + value.getMathScore();
			}

		});

		// 합계 간소화
		printInt((s) -> s.getEngScore() + s.getMathScore());

		// 영어 + 수학점수 합계
		int sum = printSum(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();
			}

		});
		System.out.println("영어점수 + 수학점수 합계: " + sum);

		System.out.println();
		System.out.println("영어평균");
		double avg = avg(new ToDoubleFunction<Student>() {

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); // int -> Double
			}

		});
		System.out.println("result: " + avg);

	}
}
