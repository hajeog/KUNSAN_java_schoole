package Testgo;
//���α׷� ó���Ұ�
import java.util.*;
public class STChois {
	Studentmake ST = new Studentmake();
	AuthorStudnt AGO = new AuthorStudnt();
	Scanner sc = new Scanner(System.in);
	public void Coisemenue() {
		STmenue mu = new STmenue();
		int i=0;
		do {
			mu.menue();
			int num = sc.nextInt();
			switch(num) {
			case 0:
				System.exit(0);
				
			case 1:
				System.out.print("�Է¹��� �л����� �� >>");
				int A = sc.nextInt();
				noberone[] Studentmake = new noberone[A];
				Studentmake=ST.GetStudent(A);
				AGO.coiseauthor(Studentmake);
				break;
			
				default:
					System.out.print("�л��� �Է����� ���� ���¿��� ó���� �Ұ��� �մϴ�.\n Ȥ�� ��ȣ �����Դϴ�");					
			}
		}while(i!=0);
	}
}