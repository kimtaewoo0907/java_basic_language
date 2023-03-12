package instance_class;

public class classIntro {

    public static void main(String[] args) {
//        System.out.println(ClassIntanceDifference.static_total);

        //클래스변수와 클래스 함수를 사용한 방식과 객체를 사용한 바식의 차이점
        //a회사의 재무처리를 한다
//        int totalA = ClassIntanceDifference.static_add(10);
//        System.out.println(totalA);
//
//        int totalB = ClassIntanceDifference.static_add(10);
//        System.out.println(totalB);

        // a회사
//        ClassIntanceDifference1 ci1  = new ClassIntanceDifference1();
//        System.out.println(ci1.instance_total);
//        ci1.instance_add(10);
//        System.out.println(ci1.instance_total);
//
//        // b회사
//        ClassIntanceDifference1 ci2  = new ClassIntanceDifference1();
//        System.out.println(ci2.instance_total);
//        ci2.instance_add(10);
//        System.out.println(ci2.instance_total);

        // 전형적인 객체형식 예제
        InstanceUserSample user1 = new InstanceUserSample();
        user1.setName("홍길동");
        user1.setPassword("aaa");

        System.out.println("이름은 " + user1.getName());
        System.out.println("비밀번호는 " + user1.getPassword());

        // 두 수를 더하고, 거기에 2를 곱하고, 거기에 3을 또 더한 값을 구하라

        // 1.지역변수를 활용한 return값 출력
        int a = 10;
        int b = 20;
        int c = method0(a, b);
        System.out.println("지역변수 result : " + c);

        // 지역변수를 쓰려다보니, 지역변수는 return을 받아 사용해야 했다
        // 2. 객체변수로 만들어보자. method1
        classIntro c1 = new classIntro();
        c1.method1(a, b);
        System.out.println("c1.instance_result : " + c1.instance_result);

        // 3. 클래스변수로 만들어서 사용해보자. method2
        method2(a,b);
        System.out.println("static_result : " + static_result);

    }

    public static int method0(int input1, int input2){
        int result = (input1 + input2) *2 + 3;
        return result;
    }

        int instance_result = 0;
        public void method1(int input1, int input2){
        this.instance_result = (input1 + input2) *2 + 3;
    }

    static int static_result = 0;
    public static void method2(int input1, int input2){
        static_result = (input1 + input2) *2 + 3;
    }
}
