package kunsan.ojh.lecture04;

import java.util.Scanner;

public class CoffeePrice {
	public void calcPrice(String order) {
		int price = 0;
		if("에스프레소".equals(order) || "카푸치노".equals(order) || "카페라떼".equals(order))
			price = 3500;
		else if("아메리카노".equals(order)) 
			price = 2000;
		else 
			System.out.println("메뉴에 없습니다. ");
		
		if(price != 0) 
			System.out.println(order + "는 " + price + "원 입니다.");
		
	}
	
	public void chooseCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 커피 드릴까요? : ");
		String order = sc.next();
		CoffeePrice menu = new CoffeePrice();
		menu.calcPrice(order);
	}
	
}
