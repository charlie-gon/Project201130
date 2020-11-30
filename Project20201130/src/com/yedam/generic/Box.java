
//201130

package com.yedam.generic;

public class Box<T> { //Box 클래스 안의 문자 T는 여러 타입에 유연하게 변환되기 위해 사용됨
	
	//어떤 유형의 타입도 담을 수 있도록 T 필드 선언.
	T obj; 
	
	//set,get 메소드 선언
	void set(T obj) { 
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}
