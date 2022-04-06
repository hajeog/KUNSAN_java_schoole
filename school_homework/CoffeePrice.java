package school_homework;
import java.util.Scanner;
public class CoffeePrice {
    public void calcPrice(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("커피 자판기 입니다\n\n\n");
        System.out.print("어떤 커피를 원하나요?");
        System.out.println("에스프레소 = 3500");
        System.out.println("카푸치노 = 3500");
        System.out.println("카페라떼 = 3500");
        System.out.println("아메리카노 = 2000");
        String order = scanner.next();
        int price=0;
        switch (order) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노" :
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
        }
        if(price != 0)
            System.out.print(order + "는 " + price + "원입니다");
    }
}
