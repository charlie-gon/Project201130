
//201203

package com.yedam.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample { // 매개값 X, 반환값은 O
	public static void main(String[] args) {

		Supplier<String> sup = null;
		sup = new Supplier<String>() {// 매개값 X

			@Override
			public String get() { // 반환값 O
				return "Hello";
			}

		};
		System.out.println(sup.get());

		Supplier<Integer> supInt = new Supplier<Integer>() {

			@Override
			public Integer get() {
				int result = 35 * 20;
				return result;
			}

		};
		System.out.println(supInt.get());

		
		//IntSupplier
		IntSupplier IntSupp = new IntSupplier() {

			@Override
			public int getAsInt() {
				return (int) (Math.random() * 6) + 1;
			}

		};
		System.out.println(IntSupp.getAsInt());
	}
}
