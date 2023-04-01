package EnumPackage;

public class Student {
    private String name;
    private EnumClass class_name; // 우리학년 class_name은 first, second, third 등 3가지 반만이 존재한다
    //변수의 타입은 enum타입으로 지정함으로서, 특정 데이터만 들어갈 수 있도록 강제하는 것
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumClass getClass_name() {
        return class_name;
    }

    public EnumClass setClass_name(EnumClass class_name) {
        this.class_name = class_name;
        return class_name;
    }
}
