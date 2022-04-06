package school_homework;
import java.util.Scanner;
public class handmultiplication {
    public void handgogodna(int start, int end , int ones, int tows) {
        for(int i=start;i<=end;i++){
            for(int j=ones;j<=tows;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println("");
        }

    }
    public void doDialog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 단 부터 몇단 까지 구구단을 출력 할까요?\n");
        int Adan = sc.nextInt();
        int Bdan = sc.nextInt();
        System.out.println("어느 수 부터 어느 수 까지 곱할까요?\n");
        int Qsan = sc.nextInt();
        int Wsan = sc.nextInt();

        handgogodna(Adan,Bdan,Qsan,Wsan);
    }
}