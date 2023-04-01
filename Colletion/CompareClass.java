package Colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass {
    public static void main(String[] args) {

//        String a = "abc";
//        String b = "abd";
//        // 문자의 크기를 비교하는 메서드
//        // 문자는 아스키코드 비교를 통해 차이만큼의 숫자 값이 return
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 9;
//        // 숫자는 크다,같다,작다만을 1,0,-1을 통해 return
//        System.out.println(a1.compareTo(a2));
        // compareTo는 Comparable 인터페이스를 구현한 메서드이다
        // compareTo는 많은 클래스에서 이미 구현이 되어있고, 매개변수가 1개밖에 없다는 게 특징이다

        // compare는 Comparetor 인터페이스를 구현해야 한다
        // collections 객체에 미리 구현되어 있기도 하지만, 일반적으로 개발자가 직접 구현하여 사용한다
        // 그리고 Comparator는 Comparable하고 다르게, compare메서드만을 가지고 있지는 않다. 여러 메서드 존재

//        List<String> st_list = new ArrayList<>();
//        st_list.add("abc");
//        st_list.add("ddd");
//        st_list.add("cde");
//        System.out.println(st_list);
//        // 오름차순 정렬
//        Collections.sort(st_list);
//        System.out.println(st_list);
//        // 내림차순 정렬을 해보자
//        Collections.sort(st_list, Collections.reverseOrder());
//        System.out.println(st_list);

        List<StudentComparator> lst = new ArrayList<>();
        StudentComparator st1 = new StudentComparator();
        st1.setName("kim");
        st1.setAge(15);
        st1.setClassNumber(1);
        lst.add(st1);

        StudentComparator st2 = new StudentComparator();
        st2.setName("choi");
        st2.setAge(16);
        st2.setClassNumber(2);
        lst.add(st2);

        StudentComparator st3 = new StudentComparator();
        st3.setName("lee");
        st3.setAge(14);
        st3.setClassNumber(3);
        lst.add(st3);

        // collections의 sort기능을 활용하되, Comparator자리에 직접 커스터마이징한 Comparator 객체를 삽입할 것이다.
        // 객체를 list에 담고 정렬시킬 때 가장 일반적인 형태이다(화살표 함수 형식)
        Collections.sort(lst, (StudentComparator o1, StudentComparator o2) -> o1.getAge() - o2.getAge());

//        Collections.sort(lst, new Comparator<StudentComparator>() {
//            @Override
//            public int compare(StudentComparator o1, StudentComparator o2) {
//                return 0;
//            }
//        });

        for(StudentComparator s : lst) {
            System.out.println("이름은 " + s.getName() + " 나이는 " + s.getAge() + " 반은 " + s.getClassNumber());
        }

    }
}
