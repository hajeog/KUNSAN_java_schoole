package Testgo;// �л� ��ȣ ���
import java.util.*;
public class Coisestudntid {
	Scanner sc = new Scanner(System.in);
	public void CoisStuent(noberone[] Student) {
		System.out.print("�л� ��ȣ�� ã��\n 0~"+Student.length+"��ŭ�� �л��� ����� ���� >>");
		int num = sc.nextInt();
		if(Student[num]==null)System.out.print("���� �л��Դϴ�.");
		else System.out.println("�й� "+Student[num].GetId()+" �̸� "+Student[num].GetName()+" �ּ� "+Student[num].GetAudress()+" ���г⵵"+Student[num].GetInschool()+" ���� "+Student[num].GetBerthday());
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}