package Generic;

public class MainClass {
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass();
        gc.setAge("20");
        gc.setName("홍길동");
        System.out.println("이 사람이 이름은 " + gc.getName() + "이고, 나이는 " + gc.getAge() + "살 입니다");
    }
}