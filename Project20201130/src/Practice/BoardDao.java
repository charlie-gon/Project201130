
//201130
//자바 컬렉션 연습문제 7

package Practice;

import java.util.ArrayList;
import java.util.List;

public class BoardDao { //게시물 가져오는 클래스
	
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		System.out.println(new Board("제목1", "내용1"));
		System.out.println(new Board("제목2", "내용2"));
		System.out.println(new Board("제목3", "내용3"));
		return list;
	}
		
		
		
		
		
		
	
	
	
	
	
	

}
