package Testgo;
import java.util.*;
public class Suchename {
	Scanner sc = new Scanner(System.in);
	public void Sname(noberone[] Student) {
		String name = sc.next();
		int o =0;
		for(int i=0;i<Student.length;i++) {
			if(Student[i].GetName()==name)System.out.print("학번 "+Student[i].GetId()+" 이름 "+Student[i].GetName()+" 주소 "+Student[i].GetAudress()+" 입학년도"+Student[i].GetInschool()+" 생일 "+Student[i].GetBerthday());
		}
		if(o==0)System.out.print("해당하는 학생이 없습니다.");
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}