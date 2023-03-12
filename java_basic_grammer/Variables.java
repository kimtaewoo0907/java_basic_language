package java_basic_grammer;

//자바 변수 기초에 대한 클래스입니다.
public class Variables {
    public static void main(String[] args) {
        /* 여기서부터 아래까지는 사용하지 않는 코드입니다.
        System.out.println("aabbcc");
        System.out.println("aabbcc2");
        */
//            System.out.println("학생이라면 student 라고 입력해주세요.");
//            Scanner sc = new Scanner(System.in);
//            String input= sc.nextLine();
//            if(input.equals("student")) {
//                System.out.println("버스요금은 500원입니다.");
//            } else {
//                System.out.println("버스요금은 1000원입니다.");
//            }
        // int라는 뜻은 a의 정수값이 되어야 한다는 선언
        // a = 3의 의미는 오른쪽의 3의 값은 왼쪽의 a변수에 대입한다는 의미
        //int a = 3;
        // a = a+1은 오른쪽의 a+1을 왼쪽의 a에 대입한다는 뜻
        // 오른쪽의 a+1은 현재 시점에서 3+1 이므로 a는 4로 재정의 된다.
        // 아래의 문구는 a를 1만큼 증가시킬 때 관용적으로 굉장히 많이 사용
        //a = a+1;
        // 변수의 명명규칙
        // 숫자로 시작할 수 없다. 띄어쓸 수 없다.
        // 의미가 다른 두 단어를 조합할 때는 구분하기 위해서 앞의 글자를 대문자로 ex) int abcAlphabet = 3;
        //System.out.println(a);

        // 자바에서 약속된 예약어를 변수명으로 쓰면 안 된다.
        // String int = "abc";

        // 변수 선언방법2
        // 초기화와 동시에 값 할당

        //byte num1 = 127;

        //변수 선언방법2
        // 초기화 따로 값 할당 따로
//        byte num2;
//        num2 = 127;
//        System.out.println(num2);

        //byte num3 = 127;
        // 아래는 오버플로우로 인해 에러가 발생 byte의 범위는 =128~127
        // num3 = num3 +1;

        // 정수 : int, long
        // int를 많이 사용, 오버플로우 나면 long 사용
        // long 타입의 경구 숫자 뒤에 L을 붙여줘서 명시적으로 구분
//        long l1 = 10L;
//        System.out.println(l1);

        // 실수 : float, double
        // 실수는 double을 많이 사용한다. float을 사용할 경우 관용적으로 f로 구분
        // float는 소수점 6자리까지 출력가능
//        float f1 = 1.23456789f;
//        double d1 = 1.23456789;
//        System.out.println(f1);
//        System.out.println(d1);
        
        // 부동소수점 : 컴퓨터에서는 2진 체계의 연산을 하다보니, 소수점 계산은 필연적으로 오차 발생
//        double num = 0;
//        for(int i=0; i<1000; i++){
//            num = num+ 0.1;
//        }
//        System.out.println("num :" + num);

        // 10의 자리를 곱하여 소숫점 자리를 없애고, 10으로 다시 나누는 방식을 쓰게 되면, 소수점 연산의 오류를 해결할 수 있다.
//        double d1 = 0.1;
//        double d2 = 0.2;
//        System.out.println((d1*10+d2*10)/10);

        // 소숫점 자리 해결을 위해 BigDecimal이라는 라이브러리 사용
//        BigDecimal d3 = new BigDecimal("0.1");
//        BigDecimal d4 = new BigDecimal("0.2");
//        System.out.println(d3.add(d4));

        // 문자의 기본형은 char이고, 한 글자를 쓸 때 사용한다.
        // 쌍따옴표가 아니라, 작은따옴표를 통해 글자를 표현
        // String은 쌍따옴표 사용, 한 글자 이상
        // 타입변환 : char -> int
//        char c1 = '김';
//        int n1 = (int)c1;
//        System.out.println(n1);
//        System.out.println(c1);

        // double -> int 변환? x
        // int -> double 변환? o
//        int n1 = 10;
//        double d1 = n1;
//        System.out.println(d1);

        // 명시적 타입변환
//        int n1 = 1;
//        int n2 = 4;
        // int / int 의 결과값은 int이므로, 0이 담기게 된다.
//        double d1 = n1/n2;
//        System.out.println(d1);
         // (double)을 통해 명시적으로 double로 타입변환 하였으므로, double / int 하여 double 결과값이 나오게 된다.
//        double d2 = (double)n1/n2;
//        System.out.println(d2);

        // null 데이터가 없다는 명시적인 표현
//        String s1 = null;
//        System.out.println(s1);

        // boolean은 true / false 2가지
//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 30;
//        if(n1<n2 && n2>n3) {
//            System.out.println("참입니다.");
//        } else {
//            System.out.println("거짓입니다.");
//        }

//        System.out.println("숫자 2개를 입력해주세요");
//        System.out.println("첫번째 숫자를 입력해주세요");
//
//        Scanner sc = new Scanner(System.in);
//        int firstNum= sc.nextInt();
//        System.out.println("firstNum " + firstNum);
//
//        System.out.println("두번째 숫자를 입력해주세요");
//
//        Scanner sc2 = new Scanner(System.in);
//        int secondNum= sc2.nextInt();
//        System.out.println("secondNum " + secondNum);
//
//        if(firstNum<secondNum) {
//            System.out.println("더 큰 숫자는" + secondNum + "입니다.");
//        } else {
//            System.out.println("더 큰 숫자는" + firstNum + "입니다.");
//        }

        // 변수란 변할 수 있는 숫자, 상수는 변할 수 없는 숫자 * 상수의 이름은 대부분 대문자로 지정
        int n1 = 10;
        n1 = 20;
        n1 = n1+10;
        System.out.println(n1);

        // final을 통해서 변할 수 없는 상수값을 지정
        final int BUSFEE = 1000;

        // 상수값은 선언과 초기화가 따로 될 수는 없다.

    }
}