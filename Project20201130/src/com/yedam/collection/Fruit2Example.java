
//201201

package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fruit2Example {
	public static void main(String[] args) {
		
		//내용이 아니라 문자열 개수와 가격이 같으면 동일한 것으로 취급
		
		Set<Fruit2> fruits = new HashSet<>();
		fruits.add(new Fruit2("사과", 1020));
		fruits.add(new Fruit2("오레지", 1000));
		fruits.add(new Fruit2("수박", 1020));
		
		Iterator<Fruit2> fiter = fruits.iterator();
		while(fiter.hasNext()) {
			Fruit2 fruit = fiter.next();
			System.out.println(fruit.getName() + " " + fruit.getPrice());
		}
		
		
	}

}
