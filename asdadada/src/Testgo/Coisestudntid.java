package Testgo;// 학생 번호 출력
import java.util.*;
public class Coisestudntid {
	Scanner sc = new Scanner(System.in);
	public void CoisStuent(noberone[] Student) {
		System.out.print("학생 번호로 찾기\n 0~"+Student.length+"만큼의 학생중 몇번을 선택 >>");
		int num = sc.nextInt();
		if(Student[num]==null)System.out.print("없는 학생입니다.");
		else System.out.println("학번 "+Student[num].GetId()+" 이름 "+Student[num].GetName()+" 주소 "+Student[num].GetAudress()+" 입학년도"+Student[num].GetInschool()+" 생일 "+Student[num].GetBerthday());
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}