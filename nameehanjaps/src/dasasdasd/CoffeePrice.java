package kunsan.ojh.lecture04;

import java.util.Scanner;

public class CoffeePrice {
	public void calcPrice(String order) {
		int price = 0;
		if("����������".equals(order) || "īǪġ��".equals(order) || "ī���".equals(order))
			price = 3500;
		else if("�Ƹ޸�ī��".equals(order)) 
			price = 2000;
		else 
			System.out.println("�޴��� �����ϴ�. ");
		
		if(price != 0) 
			System.out.println(order + "�� " + price + "�� �Դϴ�.");
		
	}
	
	public void chooseCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� Ŀ�� �帱���? : ");
		String order = sc.next();
		CoffeePrice menu = new CoffeePrice();
		menu.calcPrice(order);
	}
	
}
