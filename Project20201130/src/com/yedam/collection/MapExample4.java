
//201201
//이진 트리 구조

package com.yedam.collection;

import java.util.TreeSet;

public class MapExample4 {
	
	public static void main(String[] args) {
		
		//트리는 데이터 받을 때 크거나 작은 기준으로 나열하여 저장한다
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);
		
		tset.first(); //가장 작은 값
		tset.last(); //가장 큰 값
		
		System.out.println(tset.first());
		System.out.println(tset.last());
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("Hong");
		tstr.add("Hwang");
		tstr.add("Park");
		tstr.add("Choi");
		
		//문자의 경우 ㄱㄴㄷ 혹은 abc 순서로 값의 높고 낮음을 판별
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
		TreeSet<Student> tstu = new TreeSet<>();
		tstu.add(new Student(100, "Hong", 80));
		tstu.add(new Student(101, "Park", 70));
		tstu.add(new Student(102, "Choi", 50));
		
		//실행하면 오류 발생
		//Student 클래스는 크다 작다를 판단할 수 없기 때문. 
		//따라서 om.yedam.collection의 Student 클래스에서 implements Comparable 추가 필요 
		System.out.println(tstu.first().getStudentNo() + " " + tstu.first().getStudentName());
		System.out.println(tstu.last().getStudentNo() + " " + tstu.last().getStudentName());
	}
	

}
