package Testgo;
public class PrintStudnt {
	public void Printall(noberone[] Student) {
		for(int i=0;i<Student.length;i++) {
			System.out.println("�й� "+Student[i].GetId()+" �̸� "+Student[i].GetName()+" �ּ� "+Student[i].GetAudress()+" ���г⵵"+Student[i].GetInschool()+" ���� "+Student[i].GetBerthday());
		}
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}