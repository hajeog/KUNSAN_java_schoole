package kunsan.ojh.lecture04;

import java.util.Scanner;

public class Bonus2 {
	public void giveBonus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǥ�� 300�̻��� ���ʽ��� 100������ �Ǹ��ʰ����� 10%�� �����մϴ�.");
		
		System.out.println("����� �̸��� �Է��ϼ���: ");
		String name = scanner.next();
		
		System.out.println("����� �̹� �� �Ǹž��� �Է��ϼ���: ");
		int yoursales = scanner.nextInt();
		
		if(yoursales >= 300) {
			System.out.println("�� : Satisfactory");
			double bonus = 100 + 0.1 * (yoursales - 300);
			System.out.println(name + "���� ���ʽ���" + bonus+ "���� �Դϴ�.");
		}
		else {
			System.out.println("�� : Unsatisfactory");
			System.out.println(name + "���� ���ʽ��� �����ϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonus2 b = new Bonus2();
		b.giveBonus();
	}

}
