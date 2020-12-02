
//201201
//매우 중요함
//모르면 안됨
//모르면 자면 안됨

package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "이재용"), 90);
		map.put(new Student(103, "김봉진"), 70);
		map.put(new Student(103, "김봉진"), 80);
		map.put(new Student(108, "이재용"), 88);

		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("Name: " + student.getStudentName() + " No: " + student.getStudentNo() + " Score: "
					+ map.get(student));
		}
		System.out.println();

		// 평균 구하기(keySet)
		Set<Student> avg = map.keySet();
		int numSize = avg.size();

		int sum = 0;
		for (Student num : avg) {
			sum += map.get(num);

		}
		System.out.println("Avg: " + sum / numSize);

		// 평균 구하기(entrySet)
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		int entSize = entrySet.size();

		int entSum = 0;
		for (Entry<Student, Integer> ent : entrySet) {
			entSum += ent.getValue();
		}
		System.out.println("Avg: " + entSum / entSize);

	}

}
