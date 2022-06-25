package kunsan.ojh.lecture04;

import java.util.Scanner;

public class Bonus2 {
	public void giveBonus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("목표액 300이상은 보너스로 100만원과 판매초과액의 10%를 제공합니다.");
		
		System.out.println("당신의 이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.println("당신의 이번 달 판매액을 입력하세요: ");
		int yoursales = scanner.nextInt();
		
		if(yoursales >= 300) {
			System.out.println("평가 : Satisfactory");
			double bonus = 100 + 0.1 * (yoursales - 300);
			System.out.println(name + "님의 보너스는" + bonus+ "만원 입니다.");
		}
		else {
			System.out.println("평가 : Unsatisfactory");
			System.out.println(name + "님의 보너스는 없습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonus2 b = new Bonus2();
		b.giveBonus();
	}

}
