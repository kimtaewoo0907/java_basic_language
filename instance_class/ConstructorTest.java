package instance_class;

// 생성자(Constructor)는 메서드인데, 클래스의 이름을 가진 메서드
// 생성자의 역할은 인스턴스변수를 초기화하는데 있다
// 생성자 메서드는 객체가 생성됨과 동시에 실챙되는 메서드이다
public class ConstructorTest {
    private String name;
    private String email;
    private String password;
    private int age;

    // 생성자가 선언되어 있지 않으면, 매개변수가 없는 기본 생성자가 생성된다
    // 별도의 생성자를 추가하게 되면, 반드시 기본생성자를 따로 추가해줘야 한다
    // InstanceUserSample user1 = new InstanceUserSample();
//    public ConstructorTest(){} <- 기본생성자

    // this()는 같은 클래스 내에 타입에 맞는 다른 생성자를 호출
    // super()는 타입에 맞는 부모클래스의 생성자를 호출하는 것(상속)
    public ConstructorTest(String password, int age) {
        this.password = password;
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
