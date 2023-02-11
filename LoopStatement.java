import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {

        //int num에 숫자가 주어졌을 때
        //해당 숫자를 가지고 n*1, n*2, n*3 ... n*9 단을 출력해보자.

//        System.out.println("숫자를 눌러주세요.");
//
//        Scanner sc = new Scanner(System.in);
//        int num= sc.nextInt();
//        System.out.println(num+ "*1" + "=" + num*1);
//        System.out.println(num+ "*2" + "=" + num*2);
//        System.out.println(num+ "*3" + "=" + num*3);
//        System.out.println(num+ "*4" + "=" + num*4);
//        System.out.println(num+ "*5" + "=" + num*5);
//        System.out.println(num+ "*6" + "=" + num*6);
//        System.out.println(num+ "*7" + "=" + num*7);
//        System.out.println(num+ "*8" + "=" + num*8);
//        System.out.println(num+ "*9" + "=" + num*9);

        //while문 기본 문법
        System.out.println("숫자를 눌러주세요.");

        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int a=1;
            while(a<10) {
                System.out.println(num + "*" + a + " = " +num*a + "입니다.");
                a = a+1;
            }

    }
}
