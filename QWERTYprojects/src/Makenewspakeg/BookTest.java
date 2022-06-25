package Makenewspakeg;
import java.util.*;
import Makenewspakeg.*;
public class BookTest {

	public static void main(String[] args) {// ����å DB
		
		ArrayList<Book> bs = new ArrayList<>();
		
		bs.add(new Book("9788937485619", "�Ҿ���� �ð��� ã�Ƽ�", "������ ���罺Ʈ", "������", 8500.0, "��Ÿ�ӽ���, ���� ���塻 ���� 20���� �ְ��� å"));
		bs.add(new Book("9788954620512", "���̾�", "�츣�� �켼", "������", 8500.0, "�Ҿ��� ������ ��ġ�� ��ȥ�� �ڼ���"));
		bs.add(new Magazine("9788954620260", "��� ���е���", "������", "���ƻ��̾�", 8500.0, "�ʵ��л��� ���� �Ѵ޿� �� �� �����ϴ� ���и�ȭ ����", 2020, 3));
		bs.add(new Book("9771975252008", "�ð� ����", "�̳���", "���е���", 9900.0, "�� 13ȸ ���е��� ��� ���л� ������"));
		bs.add(new Magazine("9771228402006", "����21", "������", "����21", 3800.0, "���ѹα��� ��ȭ ���� ����", 2020, 4));
		bs.add(new Magazine("9771227130009", "����", "������", "���̴���", 12000.0, "�����Ͽ��� ���ÿ� ����ǰ� �ִ� �������� ���� ������", 2019, 11));
		bs.add(new Book("9788937460586", "�˴ٸ�Ÿ", "�츣�� �켼", "������", 6300.0, "�켼�� �Ҽ��� ����ȭ�� ��ó�� ����"));
		bs.add(new Book("9788937460586", "�˴ٸ�Ÿ", "�츣�� �켼", "������", 6300.0, "�켼�� �Ҽ��� ����ȭ�� ��ó�� ����"));
		
		printBooks(bs);
	}
	
	
	public static void printBooks(ArrayList<Book> bs) {// ��� �޼ҵ�
		
		BookMgrImpl service = BookMgrImpl.getInstance(); 
		
		// ���� �޼ҵ��� �迭���� �޾ƿ� ����å ��ü���� service�� �ִ� ArrayList�� �߰���
		for(Book b : bs) {
			System.out.println(b);
			service.addBook(b);
		}
		
		boolean menu = true; // �޴� ����ġ
		while(menu == true) { // �޴� ����ġ�� �����ִ� ���� ���ѹݺ�
			System.out.println("===============================");
			System.out.println("S ���� ���� ������ ���� �������Դϴ�.");
			System.out.println("1. ��ȸ�ϱ�");
			System.out.println("2. �߰��ϱ�");
			System.out.println("3. å ã��");
			System.out.println("4. ��üå ���� �հ� �� ��� ��ȸ");
			System.out.println("===============================");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); // �޴� ��ȣ �Է�

			// 1. ��ȸ�ϱ�
			if(choice == 1) {
				System.out.println("===============================");
				System.out.println("� ������� å�� ��ȸ�ϰڽ��ϱ�?");
				System.out.println("1. ������ ��ü ����å ��ȸ�ϱ�");
				System.out.println("2. �Ϲݵ����� ��ȸ�ϱ�(���� ����)");
				System.out.println("3. ������ ��ȸ�ϱ�(�Ϲݵ��� ����)");
				System.out.println("===============================");
				sc.nextLine();
				int search = sc.nextInt(); 
				if(search == 1) System.out.println(service.getAllBook());
				else if(search == 2) System.out.println(service.onlySearchBook());
				else if(search == 3) System.out.println(service.onlySearchMagazine());
			}

			// 2. �߰��ϱ�
			if(choice == 2) {
				System.out.println("ISBN�� �Է��ϼ���."); 
				String isbn = sc.next(); 
				System.out.println("å ������ �Է��ϼ���."); sc.nextLine();
				String title = sc.nextLine();
				System.out.println("�۰��� �Է��ϼ���.");
				String author = sc.nextLine();
				System.out.println("���ǻ縦 �Է��ϼ���.");
				String publisher = sc.nextLine();
				System.out.println("������ �Է��ϼ���.");
				Double price = sc.nextDouble(); sc.nextLine();
				System.out.println("������ ������ �Է��ϼ���.");
				String desc = sc.nextLine();
				System.out.println("�Ϲݵ����̸� true, �����̸� false�� �Է��ϼ���."); 
				Boolean bkOrMaga = sc.nextBoolean();
				if(bkOrMaga.equals(true)) {
					service.addBook(new Book(isbn, title, author, publisher, price, desc));
				}
				else if(bkOrMaga.equals(false)) {
					System.out.println("�Ⱓ������ �Է��ϼ���.");
					int year = sc.nextInt();
					System.out.println("�Ⱓ���� �Է��ϼ���.");
					int month = sc.nextInt();
					service.addBook(new Magazine(isbn, title, author, publisher, price, desc, year, month));
				}
			}

			// 3. å ã��
			if(choice == 3) {
				System.out.println("===============================");
				System.out.println("� ������� å�� ã�ڽ��ϱ�?");
				System.out.println("1. ISBN���� å ã��");
				System.out.println("2. å �������� å ã��");
				System.out.println("3. �Ⱓ������ ���� ã��");
				System.out.println("4. ���ǻ�� å ã��");
				System.out.println("5. Ư�� ���� ������ å ã��");
				System.out.println("6. ��������");
				System.out.println("===============================");
				sc.nextLine();
				int search = sc.nextInt(); 

				if(search == 1) { // ISBN���� å ã��
					System.out.println("ISBN�� �Է��ϼ���.");
					String isbn = sc.next(); sc.nextLine();
					System.out.println(service.searchBookByIsbn(isbn));
				}
				else if(search == 2) { // å �������� å ã��
					System.out.println("å ������ �Է��ϼ���.");  sc.nextLine();
					String title = sc.nextLine(); 
					System.out.println(service.searchBookByTitle(title));
				}
				else if(search == 3) { // �Ⱓ������ ���� ã��
					System.out.println("�Ⱓ������ �Է��ϼ���.(���� --> 2020)"); 
					int year = sc.nextInt(); 
					System.out.println(service.magazineOfThisYearInfo(year));
				}
				else if(search == 4) { // 4. ���ǻ�� å ã��
					System.out.println("���ǻ縦 �Է��ϼ���.");
					String publisher = sc.next();
					System.out.println(service.searchBookByPublisher(publisher));
				}
				else if(search == 5) { // 5. Ư�� ���� ������ å ã��
					System.out.println("������ �Է��ϼ���.");
					int price = sc.nextInt(); sc.nextLine();
					System.out.println(service.searchBookByPrice(price));
				}
				else if(search == 6) menu = true; // 6. ��������
				else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

			// 4. ��üå ���� �հ� �� ��� ��ȸ
			if(choice == 4) {
				System.out.println("��üå ���� �հ� : " + service.getTotalPrice());
				System.out.println("��üå ���� ��� : " + service.getAvgPrice());
			}
			
		}

	}

}
