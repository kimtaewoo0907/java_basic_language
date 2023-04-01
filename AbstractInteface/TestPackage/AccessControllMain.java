package AbstractInteface.TestPackage;

import AbstractInteface.AccessControll;

public class AccessControllMain extends AccessControll{
    public static void main(String[] args) {
        // AccessControll 테스트
        AccessControll ac = new AccessControll();
        System.out.println(ac.name1);
        System.out.println(ac.name2);
        System.out.println(ac.name3);
        // protercted변수의 경우 상속을 받을 경우 다른 패키지라 할지라도 접근 가능
        AccessControllMain ac2 = new AccessControllMain();
        System.out.println(ac2.name1);
        System.out.println(ac2.name2);
        System.out.println(ac2.name3);
    }
}
