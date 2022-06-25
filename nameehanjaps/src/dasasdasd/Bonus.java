package kunsan.ojh.lecture04;

import java.util.Scanner;

public class Bonus {
	
	public void giveBonus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("목표액은 300. 300이상은 보너스 100만원 입니다.");
		
		System.out.println("당신의 이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.println("당신의 이번 달 판매액을 입력하세요: ");
		int yoursales = scanner.nextInt();
		
		if(yoursales >= 300) {
			int bonus = 100;
			System.out.println(name + "님의 보너스는" + bonus+ "만원 입니다.");
		}
		else {
			System.out.println("너의 보너스는 없다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bonus b = new Bonus();
		b.giveBonus();
	}

}
