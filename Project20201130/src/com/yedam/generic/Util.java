
//201130
package com.yedam.generic;

public class Util {
	
	
	//generic 기능을 활용한 비교 구문 만들기
	public static <T, M> boolean compare(Pair<T, M> p1, Pair<T, M> p2) {
		boolean k = p1.getKind().equals(p2.getKind());
		boolean m = p1.getModel().equals(p2.getModel());
//		return k && m; //종류 및 모델값 둘 다 같아야 논리적으로 동일
		return m; //모델값만 같으면 논리적으로 동일
	}
	
	public static <T> Box<T> boxing(T t){ //boxing이라는 메소드 매개변수는 generic T
		Box<T> box = new Box<T>();
		box.set(t);
		return null;
	}
	

}
