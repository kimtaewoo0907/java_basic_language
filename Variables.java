import java.sql.SQLOutput;
import java.util.Scanner;

//자바 변수 기초에 대한 클래스입니다.
public class Variables {
    public static void main(String[] args) {
        /* 여기서부터 아래까지는 사용하지 않는 코드입니다.
        System.out.println("aabbcc");
        System.out.println("aabbcc2");
        */
        System.out.println("학생이라면 student 라고 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        if(input.equals("student")) {
            System.out.println("버스요금은 500원입니다.");
        } else {
            System.out.println("버스요금은 1000원입니다.");
        }
    }
}