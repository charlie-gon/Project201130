
//201130
//자바 컬렉션 연습문제 7

package Practice;

import java.util.List;

public class ListExample { 
	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		
		//BoardDao 객체의 getBoardList 메소드를 호출하면 List<Board> 타입의 컬렉션 리턴
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
	}
	

}
