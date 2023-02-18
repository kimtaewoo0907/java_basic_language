import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
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
//        System.out.println("숫자를 눌러주세요.");
//
//        Scanner sc = new Scanner(System.in);
//        int num= sc.nextInt();
//
//        int a=1;
//            while(a<10) {
//                System.out.println(num + "*" + a + " = " +num*a + "입니다.");
//                a = a+1;
//            }
//            int num = 1;
//            int num2 = 9;
//            while(num<10) {
//                System.out.println(num+"X"+num2+"="+num*num2);
//                num ++;
//                num2 --;
//            }
        // 32 : 10의 몫 + 나머지

//        answer += a%10; //1
//        a /= 10;
//        answer += a%10; //3

        // a=321
//        answer += a%10; //answer에 더할 값 1
//        a /= 10; //32
//        answer +=a%10; //answer에 더할 값 2
//        a /= 10; //3
//        answer += a%10; //answer에 더할 값 3

        // a=4321
        //answer += a%10; // 1
        // a /= 10;
//        int a = 54321;
//        int answer = 0;
//        while(a>0) {
//            answer += a%10;
//            a /= 10;
//        }
//        System.out.println(answer);

        //약수의 갯수를 구하기
//            int a = 100;
//            int count = 0;
//            int start = 1;
//            while(start <= a) {
//                if(a%start==0) {
//                    count++;
//                    System.out.println(start);
//                }
//                start++;
//            }
//            System.out.println(count*2);

        //사칙연산 프로그램 : while, switch 이용해서
        //Scanner를 통해서 + - * / 중 하나 입력하시오
        //두 개의 숫자 입력하시오
        //while문은 무한 반복

//        while(true){
//            System.out.println("+ - * / 중 하나 입력하시오");
//            Scanner sc1 = new Scanner(System.in);
//            String calc = sc1.nextLine();
//            System.out.println("숫자 두 개를 입력해주세요");
//            Scanner sc2 = new Scanner(System.in);
//            Double num1 = sc2.nextDouble();
//            Scanner sc3 = new Scanner(System.in);
//            Double num2 = sc2.nextDouble();
//            switch (calc){
//                case "+":
//                    System.out.println("결과 값은" +(num1+num2)+"입니다.");
//                    break;
//                case "-":
//                    System.out.println("결과 값은" +(num1-num2)+"입니다.");
//                    break;
//                case "*":
//                    System.out.println("결과 값은" +(num1*num2)+"입니다.");
//                    break;
//                case "/":
//                    System.out.println("결과 값은" +(num1/num2)+"입니다.");
//                    break;
//                default :
//                    System.out.println("잘못 입력 하셨습니다.");
//                    break;
//            }
//
//        }


        //변수의 유효범위는 {}까지만 유효하고 하위 depth에서는 상위 depth값을 알지만
        //상위 depth에서는 하위 depth에서 선언된 값을 알지 못 한다.


//
//        for(int i=0;i<5;i++){
//            arr1[i] +=10;
//            System.out.println(arr1[i]);
//        }

        //enhanced for문
//        for(int a : arr1){
//            System.out.println(a);
//        }

        //String 타입으로 "aaa", "bbb", "ccc", "ddd", "fff"를 담고,
        //foreach문을 통해 출력해보자.

//        String[] st1 = {"aaa","bbb","ccc","ddd","fff"};
//
//        for(int i=0; i<st1.length; i++){
//            System.out.println(st1[i]);
//        }
//
//        for(String a : st1){
//            System.out.println(a);
//        }

        //2중(다중) 반복문

//        for(int i=2; i<6; i++) {
//            System.out.println(i+"단 입니다.");
//            for (int a = 1; a < 10; a++) {
//                System.out.println(i + "X" + a + "=" + i * a);
//            }
//        }

        //배열

        //총합
        //평균
        //최대값, 최소값

//        int[] arr1 = {100,40,20,60,80,30};
//        int total=0;
//        double avr = 0;
//        int max = arr1[0];
//        int min = arr1[0];
//
//        int total2 = Arrays.stream(arr1).sum();
//        double avr2 = Arrays.stream(arr1).average().getAsDouble();
//        int max2 = Arrays.stream(arr1).max().getAsInt();
//        int min2 = Arrays.stream(arr1).min().getAsInt();
//
//
//        for(int i=0; i<arr1.length; i++) {
//            total += arr1[i];
//        }
//        System.out.println(total);
//
//        avr = (double)total/arr1.length;
//        System.out.println(avr);
//
//        for(int j=0; j<arr1.length; j++) {
//
//            if(max<arr1[j])max = arr1[j];
//            if(min>arr1[j])min = arr1[j];
//
//        }
//        System.out.println(max);
//        System.out.println(min);
//
//        int max22 = 0;
//        for(int i=1; i<min; i++) {
//            boolean trueOrNot = true;
//            for (int a : arr1) {
//                if(a%i !=0){
//                    trueOrNot = false;
//                }
//            }
//            if(trueOrNot == true){
//                max22 = i;
//            }
//        }
//        System.out.println(max22);
//
//        int min22 = max22;
//
////        최소공배수 : 최대공약수 * (a/최대공약수) * (b / 최대공약수)
//        for(int i=1; i<arr1.length; i++) {
//            min22 *= (arr1[i]/max22);
//        }
//        System.out.println(min22);


//            int a=10;
//            int b=20;
//            int num = a < b ? a : b;
//            int ma2 = 0;
//
//            for(int i=1;i<=num; i++){
//                if(a%i==0 && b%i==0) {
//                    ma2 = i;
//                }
//            }
//            int mi2 = ma2*(a/ma2)*(b/ma2);

        //배열의 자리 바꿈

        int[] arr = {10, 20, 30, 40, 50};
//             System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
//         if(arr[i]<arr[i+1])
//         2중 포문 + 뒷 자리가 차면 그 횟수만큼 줄어들어야 하는 것도 감안
//         bubble sort
        int[] arr2 = {50, 60, 40, 70, 10, 20};
        for (int i = 0; i < arr2.length - 1; i++){
            Boolean trueOrNot = true;
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    trueOrNot = false;
                }
            }
            if (trueOrNot == true) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}

