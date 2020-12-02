
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
		return studentNum + name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		
			Student student = (Student) obj;
			return (studentNum == student.studentNum) && (name.equals(student.name));
		

	}
	
	
	

}
