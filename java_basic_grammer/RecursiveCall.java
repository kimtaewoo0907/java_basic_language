package java_basic_grammer;

import org.w3c.dom.ls.LSOutput;

// 재귀함수란 특정함수가 자기자신을 호출하는 형태의 함수를 말한다
public class RecursiveCall {
    public static void main(String[] args) {
    // 숫자 n이 있을 때 1~n까지의 합계를 구하라
    // 방법1. for문이나 while문을 통해 반복연산을 한다
//        int n = 10;
//        int total = 0;
//        for(int i=1; i<=n; i++){
//            total += i;
//        }
//        int recur_test = 1;
//        recur_add(recur_test, 0);
//      int recur_t = recur_add(recur_test);

        // 팩토리얼
        int factorial_total = factorial(10);
        System.out.println(factorial_total);
    }
    static int static_total = 0;
//    public static void recur_add(int a, int total) {
//        // 방법1. 클래스변수를 선언하여 클래스변수에 더하여 계산
////        static_total += a;
//
//        // 방법2. 매개변수에 total값을 달고 다닌다. 그리고, 재귀함수 밖에서 값을 꺼낼 때는 static을 활용하기도 한다
//        total += a;
//        if (a == 10) {
//            static_total = total;
//            return;
//        }
//        recur_add(a + 1, total);
//    }
//         방법3. return을 void가 아닌 int로 둔다
//
//        public static int recur_add(int a){
//            if (a == 10) {
//                return 10;
//            }
//            return a + recur_add(a + 1);
//        }
//}

        // factorial 재귀함수
        // factorial을 재귀함수로 구현
        public static int factorial(int a){
            if (a == 1){
                return 1;
            }
            return a * factorial(a-1);
        }
}
