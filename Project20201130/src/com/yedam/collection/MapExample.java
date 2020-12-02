
//201201
//매우 중요함
//모르면 안됨
//모르면 자면 안됨

package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; //Entry는 Map 클래스 안에 있는 중첩클래스
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map<키타입, 밸류타입>
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map은 add 대신 put이라는 메소드 사용

		map.put("Hong", 15); // Map<String, Integer> 규칙에 맞게 작성
		map.put("Hwang", 20);
		map.put("Hong", 23);

		// get은 밸류를 가지고 오기 때문에 Integer 타입 소환
		Integer val = map.get("Hong");

		
		//keySet을 활용해 key와 value값 가져오기
		Set<String> name = map.keySet(); // 위에 선언된 key값들만 모아 Set컬렉션에 담고, 다시 이것을 name 변수에 담는다
		for (String num : name) { // key값들의 모음인 name 변수 값을 변수 num에 하나씩 담으면서 루핑

			// num안에 key값이 담겨있고, value값을 보기 위해서는 value값을 가져오는 get 메소드를 활용한다
			System.out.println("key값: " + num + " value값: " + map.get(num));
		}
		System.out.println();
		
		
		//entrySet을 활용해 key와 value값 가져오기
		Set<Entry<String, Integer>> entrySet = map.entrySet(); //변수 map에 있는 key,value 값을 entrySet에 담고, 이것을 다시 entrySet이라는 변수에 전달
		for(Entry<String, Integer> ent : entrySet) { 
			System.out.println("key값: " + ent.getKey() + " value값: " + ent.getValue());
		}
		System.out.println();

		// 따라서 밸류타입 값인 15가 출력됨
		// 중복된 값이 있을 경우, 최근 추가된 중복값이 출력됨
		// 동일 여부는 hashCode와 equals가 판단
		System.out.println();
		System.out.println(val);
		System.out.println();

		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");

		// get은 밸류값을 가져오기 때문에 키를 입력
		String result = mapInt.get(10);
		System.out.println(result);

		
		//keySet을 활용해 key와 value값 가져오기
		Set<Integer> set = mapInt.keySet();
		for (Integer num : set) {
			System.out.println("key값: " + num + " 밸류: " + mapInt.get(num));
		}
		System.out.println();
		
		
		//entrySet을 활용해 key와 value값 가져오기
		//entrySet: map 클래스 안의 또 다른 클래스
		Set<Entry<Integer,String>> entryset = mapInt.entrySet(); //key + 밸류 전부 소환
		for(Entry<Integer, String> ent : entryset) { //entryset의 key,value 값을 ent값에 넣겠음
			System.out.println("key: " + ent.getKey() + " value: " + ent.getValue());
		}
	}

}
