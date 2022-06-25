package Makenewspakeg;
import java.util.*;
import Makenewspakeg.*;
public class BookMgrImpl implements BookMgr {
	private ArrayList<Book> bList;
	
	private static BookMgrImpl mgr = new BookMgrImpl();
	
	private BookMgrImpl() {
		bList = new ArrayList<>(); // �迭�� �޸� ������ ���� �� ���൵ ��
	}
	
	public static BookMgrImpl getInstance() {
		return mgr;
	}

	// 1. ������ �Է� ���
	public void addBook(Book nBook) {
		boolean find = true;
		for(Book b : bList) {
			if(b.getIsbn().equals(nBook.getIsbn())) {
				System.out.println("������ : "+nBook.getTitle()+", �̹� �����ϰ� �ִ� å�Դϴ�.");
				find = false;
				break;
			}
		}
		if(find == true) {
			bList.add(nBook);
			System.out.println("������ : " + nBook.getTitle()+", ���������� �߰��Ǿ����ϴ�. ");
		}
	}
	
	// 2. ������ ��ü �˻� ���
	public ArrayList<Book> getAllBook(){
		return bList;
	}
	
	// 3. isbn���� ������ �˻��ϴ� ���
	public Book searchBookByIsbn(String isbn) {
		Book temp = new Book();
		for(Book b : bList) if(b.getIsbn().equals(isbn)) temp = b;
		return temp;
	}
	
	// 4. title�� ������ �˻��ϴ� ���
	public ArrayList<Book> searchBookByTitle(String title){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : bList) if(b.getTitle().contains(title)) temp.add(b);
		return temp;
	}
	
	// 5. Book�� �˻��ϴ� ���
	public ArrayList<Book> onlySearchBook(){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : bList) {
			if(b instanceof Magazine) continue;
			else temp.add(b);
		}
		return temp;
	}
	
	// 6. Magazine�� �˻��ϴ� ���
	public ArrayList<Book> onlySearchMagazine(){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : bList) if(b instanceof Magazine) temp.add(b);
		return temp;
	}
	
	// 7. Magazine �� ���� ������ �˻��ϴ� ���
	public ArrayList<Book> magazineOfThisYearInfo(int year){
		ArrayList<Book> temp = new ArrayList();
		for(Book b : bList) {
			if(b instanceof Magazine) {
				if(((Magazine) b).getYear() == year){
					temp.add(b);
				}
			}
		}
		return temp;
	}
	
	// 8. ���ǻ�� �˻��ϴ� ���
	public ArrayList<Book> searchBookByPublisher(String publisher){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : bList) {
			if(b.getPublisher().equals(publisher)) temp.add(b);
		}
		return temp;
	}
	
	// 9. �������� �˻�(���ڷ� �־��� ���ݺ��� ���� ������ ���� �˻�)
	public ArrayList<Book> searchBookByPrice(int price){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : bList) {
			if(b.getPrice() < price) {
				temp.add(b);
			}
		}
		return temp;
	}
	
	// 10. ����� ��� ������ �ݾ��� ���� ���ϴ� ���
	public int getTotalPrice() {
		int total = 0;
		for(Book b : bList) total += b.getPrice(); 
		return total;
	}
	
	// 11. ����� ��� ������ �ݾ� ����� ���ϴ� ���
	public int getAvgPrice() {
		return getTotalPrice() / bList.size();
	}
}