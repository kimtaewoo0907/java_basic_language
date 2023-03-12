package java_basic_grammer;

import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {

        //사용자한테 얼마가 있는지 입력을 받아
        //만약 돈이 10000원 이상있으면 "택시를 타시오" 출력
        //만약에 돈이 2000원 이상 있으면 "버스를 타시오" 출력
        //1000원 이상 있으면 "킥보드를 타시오" 출력
        //그렇지 않으면 "걸어가시오" 출력

//        System.out.println("갖고있는 돈을 입력해주세요");
//
//        Scanner sc = new Scanner(System.in);
//        int myMoney= sc.nextInt();
//
//        if (myMoney>=10000){
//            System.out.println("택시를 타시오");
//        } else if(myMoney>=2000 && myMoney<10000){
//            System.out.println("버스를 타시오");
//        } else if(myMoney>=1000 && myMoney<2000){
//            System.out.println("킥보드를 타시오");
//        }else{
//            System.out.println("걸어가시오");
//        }

        //알파벳 문자 1개를 입력을 받아. 해당 문자가 대문자인지 소문자인지 출력
        //대문자는 아스키코드 65~90
        //소문자는 아스키코드 97~122
//        while(true) {
//            System.out.println("문자를 입력해주세요");
//
//            Scanner sc = new Scanner(System.in);
//            char input = sc.nextLine().charAt(0);
//            int input_num = input;
//
//            if (input_num >= 65 && input_num <= 90) {
//                System.out.println("대문자 입니다");
//            } else if (input_num >= 97 && input_num <= 122) {
//                System.out.println("소문자 입니다");
//            } else {
//                System.out.println("알파벳이 아닙니다.");
//            }
//        }

        //은행고객센터
        //1번을 입력하면 "대출업무입니다"룰 출력
        //2번을 입력하면 "예금업무입니다"룰 출력
        //3번을 입력하면 "마이데이터업무입니다"룰 출력
        //4번을 입력하면 "외화송금업무입니다"룰 출력
        //그 외의 숫자를 입력하면 "상담업무입니다"룰 출력
            System.out.println("원하시는 번호를 눌러주세요.");

            Scanner sc = new Scanner(System.in);
            int myNumber= sc.nextInt();

            switch(myNumber) {
                case 1:
                    System.out.println("대출업무입니다.");
                    break;
                case 2:
                    System.out.println("예금업무입니다.");
                    break;
                case 3:
                    System.out.println("마이데이터업무입니다.");
                    break;
                case 4:
                    System.out.println("외화송급업무입니다.");
                    break;
                default:
                    System.out.println("상담업무입니다.");
                    break;
            }

        }
}
