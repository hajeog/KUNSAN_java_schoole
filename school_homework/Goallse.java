package school_homework;
import java.util.InputMismatchException;
import java.util.Scanner;
import school_homework.*;

public class Goallse {
    public void coicemap() {
        int caeqa = 0;
        int gogogo = 0;
        Scanner dr = new Scanner(System.in);
        for (int i = 0; ; ) {
            try {
                menu ko = new menu();
                ko.menufiles();
                caeqa =0;
                caeqa = dr.nextInt();
                switch (caeqa) {
                    case 0:
                        System.out.print("이용해 주셔서 감사합니다");
                        gogogo = 1;
                        break;
                    case 1:
                        CoffeePrice one = new CoffeePrice();
                        one.calcPrice();
                        break;
                    case 2:
                        WhileSample tow = new WhileSample();
                        tow.getAverage();
                        break;
                    case 3:
                        DoWhileSample tre = new DoWhileSample();
                        tre.printAtoZ();
                        break;
                    case 4:
                        AtoSUM_B foe = new AtoSUM_B();
                        foe.UserSum();
                        break;
                    case 5:
                        multiplication gogo = new multiplication();
                        gogo.gogodan();
                        break;
                    case 6:
                        handmultiplication handgogo = new handmultiplication();
                        handgogo.doDialog();
                        break;

                    default:
                        System.out.println("번호 선택을 잘못 하셨습니다 다시 확인!");
                }
                if (gogogo == 1)
                    break;
            } catch (InputMismatchException ime) {
                System.out.println("숫자만 입력하시오2");
                break;
            }

        }
    }

    public static void main(String args[]){
        Goallse colsin = new Goallse();
        colsin.coicemap();
    }
}
