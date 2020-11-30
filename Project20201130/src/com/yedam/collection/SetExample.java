
//201130

package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Welcome");
		set.add("World");
		
		for(String str : set) { //확장 for문을 사용해야 반복문 작성 가능
			System.out.println(str); //순서 없이 랜덤으로 출력 / 중복된 값 제거 후 출력(World)
		}
		
		//set 인스턴스의 값을 가져오기
		Iterator<String> iter = set.iterator(); //컬렉션 안의 요소들을 하나씩 끄집어내기 / 중복값 허용안함. 인덱스 값으로 호출 불가능
		while(iter.hasNext()) { //값이 있는지 여부 확인
			String str = iter.next(); //iter.next: 반복하면서 참일 경우 값을 가녀오겠다
			System.out.println(str);
		}
		
		//숫자로
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(38);
		numbers.add(13); //중복값을 제외
		
		numbers.remove(26); //값 삭제
		int sum = 0;
		for(Integer i : numbers) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
