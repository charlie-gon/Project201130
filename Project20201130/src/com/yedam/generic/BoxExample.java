
//201130

package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {

}

public class BoxExample { //
	public static void main(String[] args) {

		//Generic: 클래스를 선언하는 시점에 타입을 지정
		
		Box<String>box = new Box<String>(); //Box 클래스에 사용된 T가 <String>으로 변환
		String str = box.get();
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		
		System.out.println("end");
		
		//List
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>(); -> 이렇게 작성해도 된다
		
		
		list.add("Hello");
//		list.add(10); 
		//List는 Integer타입 받을 수 없음. 
		//Integer 타입 받고 싶다면 앞에서 String 대신 Integer 값만 받겠다고 선언해야 함
		
		//Apple클래스를 활용한 List 선언
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());
		
	}

}
