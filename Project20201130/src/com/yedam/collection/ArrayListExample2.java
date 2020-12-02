
//201201
//어제 복습(제네릭)

package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //List 컬렉션 선언 => list에 값을 담겠다
		list.add(new String("Hello")); //ㄴString 인수에 값을 담겠다
		list.add(new String("World"));
		list.add("Welcome");
		
		System.out.println(list.get(1));
		
		//컬렉션 크기만큼 루핑 돌면서 지정된 인덱스 값 가져오기
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(1));
		}
		System.out.println();
		
		//
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		//중복값 허용하지 않음
		
		//"Hello"는 같은 해쉬코드 값을 가지고 있기 때문에 중복으로 취급
		System.out.println("hello".hashCode());
		System.out.println("Hello".hashCode());
		
		//중복값 허용하지 않기 때문에 루핑 돌면 반복된 것 하나 제거되어 출력
		for(String i : set) {
			System.out.println(i);
		}
		System.out.println();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//위 구문과 동일한 결과값 출력
		for(String str : set) {
			System.out.println(str);
		}
		
		//중복된 값은 무엇일까
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple",1000));
		fruits.add(new Fruit("Banana",1500));
		fruits.add(new Fruit("Orange",2000));
		fruits.add(new Fruit("Apple",1000));
		
		//반복자를 통해 반복
		Iterator<Fruit> fiter = fruits.iterator();
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + " " + fruit.getPrice());
		}
		
		//물리적이지 않은, 논리적으로 같은 이름/가격일 경우 걸러내고 싶을 때는
		//hashCode와 equals를 삽입하여 활용
		
		//문자열 개수와 가격이 같으면 동일한 것으로 취급
	}

}
