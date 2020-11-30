
//201130

package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice_201130 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		list.add(20);
		list.add(25);
		
		int sum = 0;
		for(Integer i : list) {
			sum += i;
		}
		System.out.println(sum);
		
		//set사용
		//중복값 제거된 합계
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		numbers.add(45);
		numbers.add(20);
		numbers.add(25);
		
		int sumSet = 0;
		
	

}
}
