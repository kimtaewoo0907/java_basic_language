package Colletion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorClass {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,10);
        mp.put(2,20);

        // for문을 이용해서 key만 출력해주세요
        for(int a : mp.keySet()){
            System.out.println(a);
        }

        // iterator란 java 컬렉션프레임워크에서 사용되는 반복데이터를 처리하기 위한 인터페이스이다
        // 대부분 컬렉션프레임워크 자료형에 iterator()라는 메서드가 내장되어있고, 해당 메서드의 return값은 iterator 객체이다
        Iterator<Integer> it = mp.keySet().iterator();

        // Iterator 객체의 주요 메서드 : hasNext() -> 값이 있으면 true 없으면 false , next() -> 값을 꺼내는 메서드
        while(it.hasNext()){
            // next()는 값을 소모시키면서 꺼내는 메서드이다
            System.out.println(it.next());
        }

    }
}
