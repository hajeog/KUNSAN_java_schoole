package Testgo;// �л� �Է¹ް� ó���ϴ� �κ�
import java.util.*;
public class AuthorStudnt {
	Scanner sc = new Scanner(System.in);
	STmenue ST = new STmenue();	
	public void coiseauthor(noberone[] Student) {
		int i=0;
		do {
			ST.menue();
			int num = sc.nextInt();
			switch(num) {
			case 0:
				System.exit(0);
			case 1:
				STChois ST = new STChois();
				ST.Coisemenue();
			case 2:
				PrintStudnt PS = new PrintStudnt();
				PS.Printall(Student);
			case 3:
				Coisestudntid CS = new Coisestudntid();
				CS.CoisStuent(Student);
			case 4:
				AgeShow AS = new AgeShow();
				AS.Agego(Student);
			case 5:
				SubinSchoolemeddle SSM = new SubinSchoolemeddle();
				SSM.SubMiddleinschoole(Student);
			case 6:
				listStudentage lS = new listStudentage();
				lS.ageStudnt(Student);
			case 7:
				Suchename SN = new Suchename();
				SN.Sname(Student);
			case 8:
				
				default:
					System.out.print("��ȣ�� �ٽ��ѹ� Ȯ�� �ϼ���");
					AuthorStudnt AAS = new AuthorStudnt();
					AAS.coiseauthor(Student);
			}
		}while(i!=0);
	}
}