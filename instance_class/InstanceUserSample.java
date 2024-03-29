package instance_class;

public class InstanceUserSample {
    // 변수는 private으로 접근제어를 하면서, public한 메서드를 통해서 값을 세팅하도록 한다
    // private의 유효범위는 해당 class 내부에서만 접근가능
    private String name;
    private String email;
    private String password;
    private int age;

    // 변수별로 set, get 메서드가 각각 있는게 더 일반적인 형태이다
    public void setName(String name) {
        if(name.length() <2){
            System.out.println("이름이 너무 짧습니다");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // public 접근제어자는 모든 클래스에서 접근가능
    // 그래서 public 메서드를 통해 private한 변수를 접근하는 전략을 취한다
    // default : 접근제어자 생략가능하고 같은 패키지 내에서만 유효
    // protected
//    public void whoIs(String name, String email, String password, int age) {
//        if(name.length()<2) {
//            System.out.println("이름을 잘못 입력하셨습니다");
//    // return이 없으면 아래 코드가 실행되고, retrun이 있으면 메서드 강제종료
//            return;
//        }
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.age = age;
//    }
//
//    public void getUserInfo(){
//        System.out.println("이름 : " + this.name);
//        System.out.println("이메일 : " + this.email);
//        System.out.println("비밀번호 : " + this.password);
//        System.out.println("나이 : " + this.age);
//    }
}
