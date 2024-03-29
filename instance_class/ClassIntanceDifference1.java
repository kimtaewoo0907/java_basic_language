package instance_class;

public class ClassIntanceDifference1 {

    // static 붙어있는 변수와 함수는 메모리상에 항상 떠있는 형태이다
    // static이 붙으면 클래스 변수라 부른다.
    static int static_total = 0;
    // 메서드밖에서 static없이 선언된 변수는 instance(객체)변수라 부른다
    int instance_total = 0;

    // static이 붙으면 메서드가 아니라, 클래스 함수라 부른다
    // void는 비어있다라는 의미로서, 여기서는 return값이 없다는 뜻이다
    public static int static_add(int a) {
        // 메서드 안에서 선언된 변수는 지역변수라 부른다
        static_total += a;
        return static_total;
    }

    // instance변수 또한 클래변수처럼 메모리상에 상시적으로 저장된다
    // static 변수와 메모리상의 차이점은 garbage 컬렉터를 통해 instance변수는 관리된다는 것
    // garbage컬렉터란 jvm안에 내장된 불필요한 데이터를 자동삭제관리 해주는 기능이다
    // 그래서 return을 해도 되고 안 해도 되는 선택적 사항이다
    // this. 를 붙이는 이유는 매개변수명(input)과 구분을 짓기 위함이다
    public void instance_add(int a) {
            this.instance_total += a;
        }

}

