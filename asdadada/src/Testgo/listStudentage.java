package Testgo;

import java.util.Arrays;

public class listStudentage {
	public void ageStudnt(noberone[] Student) {
		Arrays.sort(Student);
		for(int i=0;i<Student.length;i++){
			System.out.println("�й� "+Student[i].GetId()+" �̸� "+Student[i].GetName()+" �ּ� "+Student[i].GetAudress()+" ���г⵵"+Student[i].GetInschool()+" ���� "+Student[i].GetBerthday());
		}
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}
