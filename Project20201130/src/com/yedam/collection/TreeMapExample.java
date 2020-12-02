
//201202
//교재 757
package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

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
		
		for(Map.Entry<Integer, String> ent: scores.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
	}
}
