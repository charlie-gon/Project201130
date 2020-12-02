
//201201
//15장 연습문제 8


package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "Park"));
		set.add(new Student(2, "엑소"));
		set.add(new Student(1, "Park"));
		
		//같은 번호일 경우 중복 제거 후 출력하기
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " " + student.name);
		}
		
	}

}
