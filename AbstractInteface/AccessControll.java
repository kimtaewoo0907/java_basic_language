package AbstractInteface;

public class AccessControll {
    // public : 모두 접근 가능
    public String name1 = "public name";
    // protected : 패키지 내 + 상속시 모두 접근 가능
    public String name2 = "protected name";
    // default : 패키지 내에서만 접근 가능
    public String name3 = "default name";
    // private : 클래스 내에서만 접근 가능
    private String name4 = "private name";

}
