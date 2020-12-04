
//120204
//교재 700페이지
//Students

package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PreducateExample2 {
	private static List<Students> list = Arrays.asList(new Students("Kim", "M", 90), new Students("Park", "W", 90),
			new Students("Choi", "M", 95), new Students("Lee", "W", 92)

	);

	public static double avg(Predicate<Students> pred) {
		int count = 0, sum = 0;
		for (Students students : list) {
			if (pred.test(students)) {
				System.out.println(students.getSex() + " " + students.getScore());
				count++;
				// 참인 경우에 count 1씩 증가. list.size로 나누어 버리면
				// 남/녀 성별 상관없이 무조건 전체 갯수만큼 나누기 해버리기 떄문에 안됨
				sum += students.getScore();
			}
		}
		return (double) sum / count; // double 타입으로 casting

	}

	public static void main(String[] args) {

		// 남자평균
		double maleAvg = avg(new Predicate<Students>() {

			@Override
			public boolean test(Students t) {
				return t.getSex().equals("M");
			}

		});
		System.out.println("남자 평균 점수: " + maleAvg);

		// 여자평균
		double femaleAvg = avg(t -> t.getSex().equals("W"));
		System.out.println(femaleAvg);

	}

}
