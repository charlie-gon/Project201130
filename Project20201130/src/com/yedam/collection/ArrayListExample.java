
//201130
//Collection의 Add,Remove,Get 실

package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		// generic 타입을 담는 ArrayList
		ArrayList<String> list = new ArrayList<>(); // 문자를 여러개 담을 수 있는 Collection
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); // 1번째 위치에 Nice 삽입. 1번째 위치가 대체되는것이 아니고, 밀려난다(추가되는)

		System.out.println("size: " + list.size()); // 전체 Collection의 크기를 구하는 list.size()
		list.add(list.size(), "last");

//		list.remove(1); //두번째 값을 지우고 싶다
//		for(String str : list) {
//			System.out.println(str);
//			
//		}
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index: " + i + " " + list.get(i));
		}

		// ArrayLisy에 숫자 담기
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);

		int sum = 0;
		for (Integer Num : listNum) {
			sum += Num;
		}
		System.out.println("listNum 합계: " + sum);

	}

}
