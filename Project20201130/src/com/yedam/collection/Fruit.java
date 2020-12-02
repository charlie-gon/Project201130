
//201201
//어제 복습(제네릭)
//ArrayListExample2의 Fruit리스트와 연결

package com.yedam.collection;

public class Fruit {

	// field
	private String name;
	private int price;

	// constructor
	public Fruit() {

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// method
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// 각 인스턴스마다 고유값을 가지도록 만든 hashCode 수정하여 중복값 걸러냄

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.name.hashCode() + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);

//		Object obj => Fruit 클래스로 Casting
		Fruit fruit = (Fruit) obj;
		return this.name.equals(fruit.name) && this.price == fruit.price;
		
	}

}
