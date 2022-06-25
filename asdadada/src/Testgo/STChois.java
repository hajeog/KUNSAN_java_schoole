package Testgo;
//프로그램 처리할거
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
				System.out.print("입력받을 학생들의 수 >>");
				int A = sc.nextInt();
				noberone[] Studentmake = new noberone[A];
				Studentmake=ST.GetStudent(A);
				AGO.coiseauthor(Studentmake);
				break;
			
				default:
					System.out.print("학생을 입력하지 않은 상태에서 처리가 불가능 합니다.\n 혹은 번호 오류입니다");					
			}
		}while(i!=0);
	}
}