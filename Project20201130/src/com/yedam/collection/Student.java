
//201201
//MapExample2

package com.yedam.collection;

public class Student implements Comparable<Student>{
	
	//field
	private int studentNo;
	private String studentName;
	private int score;
	
	//constructor
	public Student(int studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	

	public Student(int studentNo, String studentName, int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}



	//method
	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	//중복값 걸러내기
	@Override
	public int hashCode() {
		return this.studentName.hashCode() + this.studentNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		boolean b1 = this.studentName.equals(student.studentName);
		boolean b2 = this.studentNo == student.studentNo;
		return b1 && b2;
	}

	@Override
	public int compareTo(Student o) { //음수: 오름차순, 0: 같다, 양수:내림차순
		//return this.studentNo - o.studentNo;
		// return o.studentNo - this.studentNo = 역순으로
		 return o.score - this.score; //score값 순서대로 정렬
	}


}//end of class
