package kunsan.ojh.lecture04;

import java.util.Scanner;

public class Bonus {
	
	public void giveBonus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǥ���� 300. 300�̻��� ���ʽ� 100���� �Դϴ�.");
		
		System.out.println("����� �̸��� �Է��ϼ���: ");
		String name = scanner.next();
		
		System.out.println("����� �̹� �� �Ǹž��� �Է��ϼ���: ");
		int yoursales = scanner.nextInt();
		
		if(yoursales >= 300) {
			int bonus = 100;
			System.out.println(name + "���� ���ʽ���" + bonus+ "���� �Դϴ�.");
		}
		else {
			System.out.println("���� ���ʽ��� ����.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bonus b = new Bonus();
		b.giveBonus();
	}

}
