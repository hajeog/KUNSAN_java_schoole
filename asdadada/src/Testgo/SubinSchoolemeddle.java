package Testgo;
import java.util.Arrays;
public class SubinSchoolemeddle {
	public void SubMiddleinschoole(noberone[] Student) {
		double sum = 0;
		for(int i=0;i<Student.length;i++) {
			sum+=Student[i].GetInschool();
		}
		System.out.print("평균 입학 년도는 :"+(int)(sum/Student.length));
		if(Student.length%2==0) {
			Arrays.sort(Student);
			int num =Student.length;
			System.out.print("중위 값은 :"+(int)(Student[num/2].GetInschool()) );
		}
		else {
			Arrays.sort(Student);
			int num = Student.length;
			double out = Student[num].GetInschool() + Student[num+1].GetInschool();
			System.out.print("중위 값은 :"+(int)(out/2));
		}
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}