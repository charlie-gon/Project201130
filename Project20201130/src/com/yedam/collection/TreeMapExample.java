
//201202
//교재 757
package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>(); //TreeMap<key, value>
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		
//		scores.keySet(); //key값만 추출하여 set컬렉션에 담겠다
		
		for(Integer num : scores.keySet()) {
			System.out.println(num); //key값만 루핑
		}
		
		//위와는 다르게 이런 방법도 있음
//		Set<Integer> set = scores.keySet();
//		for(Integer num : set) {
//			System.out.println(num);
//		}
		
		for(Map.Entry<Integer, String> ent : scores.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
			
		}
		System.out.println();
		
//		Entry<Integer, String> ent = scores.firstEntry(); //import하던지 Map.을 추가하여 Map 안의 중첩 클래스라는 것을 선언
		Map.Entry<Integer, String> ent = scores.firstEntry(); 
		
		ent.getKey(); //가장 작은 부분 key
		ent.getValue(); //가장 작은 부분 value
		
		//가장 낮은 점수 구하기
		System.out.println("가장 낮은 점수: " + ent.getKey() + " " + ent.getValue());
		
		ent = scores.lastEntry();
		ent.getKey(); //가장 큰 부분 key
		ent.getValue(); //가장 큰 부분 value
		
		//가장 높은 점수
		System.out.println("가장 높은 점수: " + ent.getKey() + " " + ent.getValue());
		
		ent = scores.lowerEntry(95);
		System.out.println("95점 바로 아래 값: " + ent.getKey());

		ent = scores.higherEntry(87);
		System.out.println("87 바로 위 값: " + ent.getKey());

		ent = scores.floorEntry(77);
		System.out.println("77점 혹은 바로 아래 값: " + ent.getKey());
		
		ent = scores.ceilingEntry(66);
		System.out.println("66점 혹은 바로 위 값: " + ent.getKey());
		
		while(!scores.isEmpty()) {
			ent = scores.pollFirstEntry();
			System.out.println(ent.getKey() + " " + ent.getValue() + " 남은 객체 수 " + scores.size());
			
			
		}
		
	}
}
