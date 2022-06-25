package Makenewspakeg;
import java.util.*;
import Makenewspakeg.*;
public interface BookMgr {
	void addBook(Book nBook);
	ArrayList<Book> getAllBook();
	Book searchBookByIsbn(String isbn);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagazine();
	ArrayList<Book> magazineOfThisYearInfo(int year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getTotalPrice();
	int getAvgPrice();
}
