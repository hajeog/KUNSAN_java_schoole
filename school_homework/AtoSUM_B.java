package school_homework;
import java.util.Scanner;
public class AtoSUM_B {
    public void UserSum() {
        System.out.println("x와 y를 입력받아 더하는 프로그램 입니다\n\n\n");
        int A = 0;
        int B = 0;
        int sum = 0;
        Scanner Ainput = new Scanner(System.in);
        System.out.print("입력 A =");
        A = Ainput.nextInt();

        Scanner Binput = new Scanner(System.in);
        System.out.print("입력 B =");
        B = Binput.nextInt();

        if (A >= B) {
            for (int x = B; x <= A; x++) {
                sum += x;
            }
        } else {
            for (int x = A; x <= B; x++) {
                sum += x;
            }
        }
        System.out.print(" A ="+A+" \t B ="+B+" \tA+B ="+sum);
    }
}
