package mini3;
import java.util.*;
class Book{
	String title;
	String num;
	public Book(String title, String num) {
		this.title = title;
		this.num = num;
	}
	public String gettitle() {
		return title;
	}
}

public class BookManager {
		Scanner kb = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
	public void showMenu() {
		System.out.println("=======================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("=======================");
	}
	public int readInput() {
		
		int input1 = kb.nextInt();
		return input1;
	}
	public void enroll() {
		System.out.println("제목 :");
		String name = kb.next();
		System.out.println("평점 :");
		String n = kb.next();
		list.add(new Book(name,n));
	;

	}
	public void search() {
		System.out.println("조회할 책 제목을 입력하세요");
		String k = kb.next();
		for(Book s : list) {
			if(s.gettitle().contains(k)) {
				System.out.println("조회한 책이 존재합니다.");
				System.out.println("책 제목 : "+ k);
				break;
			}
			else {
				System.out.println("조회한 책이 존재하지 않습니다.");
			}
		}
	}
	public void print() {
		for(Book k: list) {
			System.out.println("제목 : "+k.title+" 평점 : "+k.num);
		}
	} 
	private static BookManager instance;
	private BookManager() {}
	
	public static BookManager getInstance() {
		  if (instance == null) { instance = new BookManager();}
	       return instance;
	}
	

}
