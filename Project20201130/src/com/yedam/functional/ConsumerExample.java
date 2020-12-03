
package com.yedam.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = null;

		//Consumer
		consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		};
		consumer.accept("Hello");

		consumer = (String t) -> System.out.println("Good");
		consumer = t -> System.out.println("Awesome " + t);

		consumer.accept("Park");
		
		BiConsumer<String, Integer> biCon = null;
		
		//BiConsumer
		//biCon이라는 익명의 구현객체 생성
		biCon = new BiConsumer<String, Integer>(){

			@Override
			public void accept(String t, Integer u) {
				System.out.println("이름은: " + t + " 춘추는: " + u);
			}
			
		};
		biCon.accept("Hong", 15);
		
		//람다 표현식 사용
		biCon = (String t, Integer u) -> System.out.println("이름은: " + t + " 춘추는: " + u);
		biCon.accept("Choi", 55);
		
		biCon = (t, u) -> System.out.println("이름은: " + t + " 춘추는: " + u);
		biCon.accept("Koo", 77);
		
		
		//ObjIntConsumer
		
		ObjIntConsumer<String> objIntCon = null;
		objIntCon = new ObjIntConsumer<String>() {


			@Override
			public void accept(String t, int value) {
				System.out.println("이름은: " + t + " 점수는: " + value);
			}
			
		};
		objIntCon.accept("Cho", 77);
		
		
	}

}
