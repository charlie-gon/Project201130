
//201130

package com.yedam.generic;

public class Pair<T, M> { //원하는 타입을 유연하게 사용하게 위해 클래스 이름 옆에 <>를 사용하여 필드 이름 넣기
	
	//T,M 이라는 type parameter 설정
	// kind, model이라는 필드에 값이 지정되도록 하겠다
	T kind;
	M model;
	
	//고정된 타입
//	int price;
//	String name;
	
	void setKind(T kind) {
		this.kind = kind; 
	}
	
	T getKind() {
		return kind;
	}
	
	void setModel(M model) {
		this.model = model;
	}
	
	M getModel() {
		return model;
	}
	
	
}// end of calss
