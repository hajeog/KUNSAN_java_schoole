package Testgo;

import java.util.Arrays;

public class listStudentage {
	public void ageStudnt(noberone[] Student) {
		Arrays.sort(Student);
		for(int i=0;i<Student.length;i++){
			System.out.println("학번 "+Student[i].GetId()+" 이름 "+Student[i].GetName()+" 주소 "+Student[i].GetAudress()+" 입학년도"+Student[i].GetInschool()+" 생일 "+Student[i].GetBerthday());
		}
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}
