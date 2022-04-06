package school_homework;
import java.util.Scanner;
public class WhileSample {
    public void getAverage(){
        System.out.println("입력한 수의 평균을 구하는 프로그램 입니다 -1을 누르면 종료 합니다.\n\n");
        Scanner rd = new Scanner(System.in);
        int n=0;
        double sum =0;
        int i=0;
        while ((i = rd.nextInt())!=-1){
            sum +=i;
            n++;
        }
        System.out.println("입력한 수의 개수는 "+n+"이며\t 더한값은"+sum/n);
    }
}
