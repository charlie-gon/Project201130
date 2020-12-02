
//201201
//15장 연습문제 8

package Practice;

public class Student {
	
	//field
	public int studentNum;
	public String name;
	
	//constructor
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode()	+ this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
//		boolean b1 = this.name.equals(student.name);
		boolean b2 = this.studentNum == student.studentNum;
		return b2;
	}
	
	
	

}
