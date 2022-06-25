package Testgo;

public class AgeShow {
	public void Agego(noberone[] Student) {
		int max=999,low=100;
		for(int i=0;i<Student.length;i++) {
			
			if(max<Student[i].GetBerthday()) {
				max = Student[i].GetBerthday();
			}
			if(low>Student[i].GetBerthday()) {
				low = Student[i].GetBerthday();
			}
		}
		System.out.println("최고령자  "+max+" "+(2022-max)+"세");
		System.out.println("최저 연령자"+low+" "+(2022-low)+"세");
		AuthorStudnt AS = new AuthorStudnt();
		AS.coiseauthor(Student);
	}
}
