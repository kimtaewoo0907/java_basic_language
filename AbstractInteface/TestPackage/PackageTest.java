package AbstractInteface.TestPackage;

// 프로그래밍에서 일반적으로 *이 의미하는 것은 all을 의미한다
// package 하위 파일단위의 *은 가능하나, 하위패키지까지 모두 가져오는 *은 불가능하다
import java.util.*;
//import java.*; <- 불가능
// java.lang 폴더는 import를 할 필요가 없이 자동으로 내장 improt 되어있다
//package java.lang.String;

public class PackageTest {
    public static void main(String[] args) {
        List<String > lst = new ArrayList<>();
        String a = "test";
    }
}
