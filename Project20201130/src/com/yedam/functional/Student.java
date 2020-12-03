
//201203
//FunctionExample 연동

package com.yedam.functional;

public class Student {
	
	//field
	private String name;
	private int engScore;
	private int mathScore;
	
	//constructor
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	//method
	public String getName() {
		return name;
	}


	public int getEngScore() {
		return engScore;
	}


	public int getMathScore() {
		return mathScore;
	}
	
	
	
	

}
