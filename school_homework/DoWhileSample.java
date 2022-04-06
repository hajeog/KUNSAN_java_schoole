package school_homework;

public class DoWhileSample {
    public void printAtoZ(){
        System.out.println("A~Z까지 출력하는 프로그램 입니다.\n\n\n");
        char a = 'a';

        do{
            System.out.print(a);
            a = (char)(a+1);
        }while (a<='z');
    }
}
