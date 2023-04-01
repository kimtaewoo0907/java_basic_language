package EnumPackage;

public class EnumMain {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setName("홍길동");
//        s1.setClass_name("first");
//        System.out.println("학생 정보는 이름: " + s1.getName() + ", 반: " + s1.getClass_name());

        Student s2 = new Student();
        s2.setName("홍길순");
        s2.setClass_name(EnumClass.FIRST);
        System.out.println("학생 정보는 이름: " + s2.getName() + ", 반: " + s2.getClass_name());


    }
}
