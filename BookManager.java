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
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. ��� å ���");
		System.out.println("4. ����");
		System.out.println("=======================");
	}
	public int readInput() {
		
		int input1 = kb.nextInt();
		return input1;
	}
	public void enroll() {
		System.out.println("���� :");
		String name = kb.next();
		System.out.println("���� :");
		String n = kb.next();
		list.add(new Book(name,n));
	;

	}
	public void search() {
		System.out.println("��ȸ�� å ������ �Է��ϼ���");
		String k = kb.next();
		for(Book s : list) {
			if(s.gettitle().contains(k)) {
				System.out.println("��ȸ�� å�� �����մϴ�.");
				System.out.println("å ���� : "+ k);
				break;
			}
			else {
				System.out.println("��ȸ�� å�� �������� �ʽ��ϴ�.");
			}
		}
	}
	public void print() {
		for(Book k: list) {
			System.out.println("���� : "+k.title+" ���� : "+k.num);
		}
	} 
	private static BookManager instance;
	private BookManager() {}
	
	public static BookManager getInstance() {
		  if (instance == null) { instance = new BookManager();}
	       return instance;
	}
	

}
