package Testgo;
import java.util.*;
public class Suchename {
	Scanner sc = new Scanner(System.in);
	public void Sname(noberone[] Student) {
		String name = sc.next();
		int o =0;
		for(int i=0;i<Student.length;i++) {
			if(Student[i].GetName()==name)System.out.print("�й� "+Student[i].GetId()+" �̸� "+Student[i].GetName()+" �ּ� "+Student[i].GetAudress()+" ���г⵵"+Student[i].GetInschool()+" ���� "+Student[i].GetBerthday());
		}
		if(o==0)System.out.print("�ش��ϴ� �л��� �����ϴ�.");
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}