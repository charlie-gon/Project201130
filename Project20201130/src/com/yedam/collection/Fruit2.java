
//201201

package com.yedam.collection;

public class Fruit2 {
	
	private String name;
	private int price;
	
	public Fruit2() {
		
	}
	
	public Fruit2(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

		@Override
	public int hashCode() {
//		return super.hashCode();
			
		return this.name.length() + this.price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		
		Fruit2 fruit = (Fruit2) obj;
		return this.name.length() == fruit.name.length() && this.price == fruit.price;
		
		
	}




	
	

}
