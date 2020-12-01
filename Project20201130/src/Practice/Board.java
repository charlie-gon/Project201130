
//201130
//15장 연습문제 7
//자바 컬렉션 연습문제 7

package Practice;

public class Board { //게시물 클래스

	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title; 
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
}
