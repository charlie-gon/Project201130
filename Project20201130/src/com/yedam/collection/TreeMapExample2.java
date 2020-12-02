
//201202

package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>(); // TreeSet<key, value>
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		scores.firstEntry();

		System.out.println(scores.firstEntry().getKey()); // 정상적인 순서의 첫번째 값

		NavigableMap<Integer, String> navigableMap = scores.descendingMap();
		navigableMap.firstEntry();

		System.out.println(navigableMap.firstEntry().getKey()); // 역순의 첫번째 값

		NavigableSet<Integer> nSet = scores.descendingKeySet(); // key값을 역순으로 반환
		System.out.println("scores 첫번째 키: " + scores.firstKey());
		System.out.println("nSet 첫번째 키: " + nSet.first());
		System.out.println();

		// 배열 오름차순 정렬
		int[] intAry = { 34, 55, 26, 48, 77 };

		TreeSet<Integer> num = new TreeSet<Integer>();

		for (int i = 0; i < intAry.length; i++) {
			num.add(intAry[i]); //루핑으로 num 변수에 배열값 추가

		}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = num.pollFirst(); //크기별로 저장	
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]); //출력
		}
	}

}
