package Testgo;
import java.util.*;
public class Studentmake {
	Scanner sc = new Scanner(System.in);
	noberone[] GetStudent(int num) {
		noberone[] Studentmake = new noberone[num];
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"�й�>>");
			int id= sc.nextInt();
			System.out.print((i+1)+"�̸� >>");
			String naem = sc.next();
			System.out.print((i+1)+"�ּ� >>");
			String audress = sc.next();
			System.out.print((i+1)+"���г⵵>>");
			int inschool= sc.nextInt();
			System.out.print((i+1)+"����>>");
			int berthday= sc.nextInt();
			Studentmake[i] = new noberone(id, naem, audress, inschool, berthday);
		}
		return Studentmake;	
	}
}