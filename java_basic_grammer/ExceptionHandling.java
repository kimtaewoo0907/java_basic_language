package java_basic_grammer;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("나누실 숫자를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();

        int child = 10;
        // 예외 발생가능성이 있는 구간에 try catch를 통해 예외를 감싼다
        try {
            System.out.println("나눗셈의 결과는 : " + child / input);
        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
            e.printStackTrace(); // 이것을 주로 씀
            System.out.println(e + "으로 나눠서 에러가 발생했습니다");
        }catch (Exception e){
            System.out.println("나눗셈에서 예외가 발생했습니다");
        }finally {
            System.out.println("무조건 실행되는 finally 구문");
        }
        System.out.println("감사합니다");

    }
}
