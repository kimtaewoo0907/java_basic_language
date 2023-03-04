import java.lang.reflect.Array;
import java.util.*;

public class OtherVariables {
    public static void main(String[] args) {
        // 기초 자료형 : 숫자, 문자(char), boolean, null
        // 문자가 1개 이상 : String
        // 여러자료형을 하나의 변수 표현 : 배열
//        int[] arr1 = {10,20,30};
//        String[] arr2 = {"kim","lee","choi"};

        // 기타 자료형
        // java에서 배열의 문제는 배열의 길이를 줄이고 늘릴수가 없다.
        // List : 배열의 발전된 형태, 배열의 길이를 줄이고 늘릴 수 있다.
        // map : key, value
        // set, queue, stack

        // String의 표현 방식
        // 1)리터럴 표현 방식
        // 원시자료형의 표현 방식
//        char c1 = 'a';
//        char c2 = 'a';
//        String st1 = "hello";
//        System.out.println(st1);
//        System.out.println(c1);
//        System.out.println(c1==c2);
//        // 2)new String 표현 방식 : 참조타입
//        // new 라는 키워드는 class를 기반으로 객체를 만들 때 사용
//        String st2 = new String("hello");
//        // 원시타입은 메모리에 값을 담아놓지만, 참조타입은 메모리 주소에 메모리 주소를 담아둔다.
//        System.out.println(st1==st2);
//        System.out.println(st1.equals(st2));

        // int와 Integer
        // long의 참조타입 Long, char의 참조타입 Character
//        int num1 = 10;
//        String st1 = "20";
//        int num2 = Integer.parseInt(st1);
//        String st2 = Integer.toString(num1);
//        System.out.println(num2);
//        System.out.println(st2.getClass());

        // indexOf : 특정 문자가 특정문자에 몇 번재 index에 해당하는 지 int로 return
//        String a = "Hello Java";
//        System.out.println(a.indexOf("Java"));
//        int num = a.indexOf("Java");
//        System.out.println(num);
//
//        // contains : 특정 문자가 특정문자에 포함되어있는 지 아닌 지를 boolean으로 return
//        System.out.println(a.contains("Java"));

        // charAt() : String을 하나씩 잘라서 char형태로 return
//        String st1 = "taewoo";
//        int count = 0;
//
//        // st1이 가지고 있는 o의 숫자는 몇 개인가?
//        for(int i=0; i<st1.length(); i++){
//            if(st1.charAt(i)=='o') {
//                count++;
//            }
//        } System.out.println("o는" + count + "개 입니다." );

        // replace : 특정 문자열을 특정 문자열로 대체
        // replaceAll : 특정 문자열을 특정 문자열로 대체, 정규표현식 사용 가능
//        String st1 ="abcabc";
//        System.out.println(st1.replace("a","o"));
//        System.out.println(st1.replaceAll("a","o"));

        // 정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는 것
        // regex(정규표현식) : regular expression
//        String st2 = "01abc123한글123";
//        // 숫자를 제외한 문자만 새로운 문자열에 담아보자
//        String st3 = st2.replaceAll("[^a-z]","");
//        System.out.println(st3);


        // substring(a,b) : a이상 b미만까지 문자열을 잘라낸다
//        String st = "hello world";
//        String st2 = st.substring(6,11);
//        System.out.println(st2);

        //toUpperCase : 대문자로 변환 / toLowerCase : 소문자로 변환
//        System.out.println(st.toUpperCase());

        // split : 특정문자열을 가지고 규칙적으로 문자열을 자를 때 사용, return값이 String[]
//        String st = "a b c d";
//        String st2 = "abcd";
//        String[] st_arr2 = st.split(" ");
//        System.out.println(Arrays.toString(st_arr2));
//
//        String st3 = "asagawqwawfaegewweqwt";
//        //indexOf
//        System.out.println(st3.indexOf("w"));
//
//        //charAt
//        for(int i=0; i<st3.length(); i++){
//            if(st3.charAt(i)=='w'){
//                System.out.println(i);;
//                break;
//            }
//        }
//
//        //split을 써서 몇 번째인지 구해보자
//        String[] st_arr3 = st3.split("");
//        System.out.println(Arrays.toString(st_arr3));
//        for(int i=0; i<st_arr3.length; i++){
//            if(st_arr3[i].equals("w")){
//                System.out.println(i);
//                break;
//            }
//        }

        // String에 값을 더해가면서 합친다
        // 메모리상의 과부하가 생길 수 있는 방식
//        String st= "abcd";
//        String[] st_arr = st.split("");
//        System.out.println(Arrays.toString(st_arr));
//        String result = "";
//        for(String a : st_arr){
//            result += a;
//        }
//        System.out.println(result);

        // StringBuffer, StringBuilder
        // 두 방법은 대부분 유사하나, StringBuilder가 성능이 더 좋음
        // 그러나, StringBuilder는 특정상황에서 문제가 발생할 여지가 있다
//        StringBuffer sb = new StringBuffer();
//        sb.append("hello");
//        sb.append(" world");
//        String result2 = sb.toString();
//        System.out.println("sb는 " + result2);
//
//        String[] arr = {"abc", "bcd", "cde", "def"};
//        StringBuffer sb2 = new StringBuffer();
//        for(String a : arr){
//            sb2.append(a);
//        }
//        sb2.insert(10,"aaaaaa");
//        String result = sb2.toString();
//        System.out.println(result);
//        System.out.println(sb2.substring(0,10));
//
//        String s = "  try   hello   world  ";
//        String[] st_arr4 = s.split("", -1);
//        String answer = "";
//        for(int i=0; i<st_arr4.length; i++) {
//            if(st_arr4[i].isBlank()) {
//                answer += st_arr4[i];
//            } else {
//                String[] a_arr = st_arr4[i].split("");
//                for (int j=0; j<a_arr.length; j++) {
//                    if (j % 2 == 0) {
//                        answer += a_arr[j].toUpperCase();
//                    } else {
//                        answer += a_arr[j].toLowerCase();
//                    }
//                }
//            } if(i!=st_arr4.length-1){
//                answer +="";
//            }
//        }
//        System.out.println(answer);

        // Trim : 문자열 양 끝에 공백을 제거
//        String db_input = "abc@naver.com";
//        System.out.println("로그인 ID를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input= sc.nextLine().trim();
//        System.out.println(input);
//        System.out.println(input.equals(db_input));

        // Strip : 문자열 양 끝에 공백을 제거, 그러나 더 좋은 성능
//        String a = "\u2000abc\u2000";
//        System.out.println(a.trim());
//        System.out.println(a.strip());

        // String에서 int로 변환
        // Integer.parseInt
//        String st = "10";
//        int num = Integer.parseInt(st);
//        System.out.println(st);

        // int에서 String으로 변환
        // Integer.toString, String.valueOf
        // 웬만한 타입은 모두 toString을 가지고 있다.
        // new해서 만드는 대부분의 객체에 toString이 있다.
//        int a = 10;
//        String st2 = Integer.toString(a);
//        st = String.valueOf(a);

        // char int간의 변환
//        char ch = 'a';
//        int num2 = (int)ch;
//        num2 = Character.valueOf(ch);
//        System.out.println(num2);

        // 배열
        // 선언과 동시에 초기화
//        int[] arr = {10,20,30,40,50};

        // 선언만 : java의 배열은 반드시 길이를 명시
        // primitive타입은 해당 타입으로 초기화, 참조형변수는 null로 초기화
//        int[] arr2 = new int[5];
//        arr2[0] = 10;
//
//        String[] aa = {"abc"};
//        String[] aa2 = new String[10];
//        System.out.println(aa2[2]);

        // Arrays클래스 기능
//        int[] arr = {30,20,10,50};
//        // 오름차순 정렬 : Arrays.sort
//        // 프로그래밍에서 별다른 설정이 없으면, 정렬의 기본은 오름차순
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        // Arrays.sort의 내림차순은 Collections.reverseOrder를 써야 한다. 그런데, primitive 타입은 안 된다.
//        String[] st_arr = {"a","aaa","aba", "aab"};
//        Arrays.sort(st_arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        // int의 내림차순 정렬 : Integer로 변환 -> Collections.reverseOrder
//        // Stream을 이용한 방법
//        Integer[] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(arr_integer, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));
//
//        // int의 내림차순이 기억이 안 난다. 어렵다, 오름차순으로 정렬시키고, 내림차순은 직접
//        Arrays.sort(arr);
////      10,20,30,50
//        int[] arr_new = new int[arr.length];
//        int cnt = 0;
//        for(int i=arr.length-1; i>=0; i--){
//            arr_new[cnt] = arr[i];
//            cnt++;
//        }
//      50,30,20,10

        // 검색 : binarySearch(이진검색) - 자료형이 정렬되어 있어야 정상적으로 자료를 검색하여 index를 return
//        int[] arr = {30,20,10,40};
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 30));

        // 배열의 복사 : copyOf(복사 하고자 하는 배열, length), copyOfRange(복사 하고자 하는 배열, a, b)
//        String[] arr_st = {"a1", "a2", "a3"};
//        String[] arr_st2 = Arrays.copyOf(arr_st, 0);
//        System.out.println(Arrays.toString(arr_st2));

        // List와 배열과의 차이는 자료길이의 유연함이다.
        // 선언방법은 new List를 통해 list를 생성한다.
//        List<String> l1 = new ArrayList<>();
//        l1.add("abc");
//        l1.add("bcd");
//        System.out.println(l1);

        // 배열에서 list로의 변환
//        String[] arr = {"a1","b1","c1","d1"};
//        List<String> l1 = new ArrayList<>(Arrays.asList(arr));
//        List<String> l2 = new ArrayList<>();
//        for(String a : arr) {
//            l2.add(a);
//        }
//
//        // List에서 배열로의 변환
//        // List에서 값을 꺼내는 메서드는 l2.get(index)
//        // List의 크기를 구하는 메서드는 l2.size();
//        String[] answer = new String[l2.size()];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = l2.get(i);
//        }
//        String[] anwser2 = l2.stream().toArray(String[]::new);
//
//        // int배열에서 List로 전환
//        int[] arr2 = {10,20,30,40};
//        List<Integer> l3 = new ArrayList<>();
//        for(int a : arr2){
//            l3.add(a);
//        }
//        System.out.println(l3);

        // List의 remove는 index로 지울 수도 있고, value로 지울 수도 있다
//        List<Integer> lst = new ArrayList<>();
//        lst.add(1);
//        lst.add(2);
//        lst.add(3);
//        lst.remove(2);
//        System.out.println(lst.contains(3));
//        System.out.println(lst.isEmpty());

        // List의 정렬 : sort, Comparator.naturalOrder(오름차순), Comparator.reverseOrder(내림차순)
//        List<String> lst = new ArrayList<>();
//        lst.add("b");
//        lst.add("a");
//        lst.add("c");
//        lst.sort(Comparator.naturalOrder());
//        lst.sort(Comparator.reverseOrder());
//        String[] arr = {"b","a","c"};
//        Arrays.sort(arr);
//        Arrays.sort(arr, Comparator.reverseOrder());
//
//        int[] arr_num = {4,2,1,3};
//        Integer[] arr_num_new = new Integer[arr_num.length];
//        int cnt = 0;
//        for(int a : arr_num){
//            arr_num_new[cnt] = a;
//            cnt++;
//        }
//        Arrays.sort(arr_num_new, Comparator.reverseOrder());

        // map : key, value로 이루어져있는 자료형
//        Map<String, String> mp = new HashMap<>();
        // map에 값을 더할 때 *map에서 key는 중복되지 않는다.
        // map의 key에는 순서가 없다.
//        mp.put("a1", "abc");
//        mp.put("a2", "abc");
//        mp.put("a3", "abc");
//        System.out.println(mp);
        // map에서 값을 꺼낼 때는 key를 통해 값을 꺼낸다. value가 중복 가능하므로 value를 통해 값을 꺼낼 수는 없다
//        System.out.println(mp.get("a1"));
        // map은 자료 검색시 key를 통해 굉장히 빠르게 value를 찾아올 수 있다

        // key 목록
//        System.out.println(mp.keySet());
        // 각 key에 문자 f를 붙여 출력해보라.
//        for(String a: mp.keySet()){
//            System.out.println(a + "f");
//        }
//        // value 목록
////        System.out.println(mp.values());
//        // containskey : 해당 key가 있는지 없는지
////        System.out.println(mp.containsKey("a1"));
//
//        // map의 요소를 출력하는 방법1. Enhanced For문
//        Map<String, String> mp1 = new HashMap<>();
//        mp1.put("a1", "abc");
//        mp1.put("a2", "abc");
//        mp1.put("a3", "abc");
//        for(String b : mp1.keySet()){
//            System.out.println(b);
//        }
//        // 방법2. iterator 방식 : iterator() 메소드를 이용한 요쇼의 출력
//        // Iterator의 특징은 요소를 꺼낼때 소모가 된다
//        Iterator<String> iter = mp1.keySet().iterator();
//        // hasNext()는 요소가 있는지 없는지를 boolean형태로 출력
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        while(iter.hasNext()){
//        // next()는 요소를 꺼내는 메서드
//            System.out.println("haxNext가 true입니다.");
//        }
//
//        // 마라톤에서 완주하지 못한 선수
//        String[] par = {"leo", "kiki", "eden","aaaa"};
//        String[] com = {"eden", "kiki", "aaaa"};
//        List<String> lst_com = new ArrayList<>(Arrays.asList(com));
//        String answer = "";
//        for(String a: par){
//            if(lst_com.contains(a)){
//                lst_com.remove(a);
//            } else {
//                answer = a;
//                break;
//            }
//        }
//        System.out.println(answer);
//
//        Map<String, Integer> mp2 = new HashMap<>();
//        // 완주자 목록을 mp2에다가 넣어두고, participant로 조회해올지
//        // participant 목록을 mp2에다가 넣어두고, 완주목록으로 조회해올지
//        for(String a : com) {
////            if (mp2.containsKey(a)) {
////                mp2.put(a, mp2.get(a) + 1);
////            } else {
////                mp2.put(a, 1);
////            }
//            // getOrDefault : key를 통해 값을 꺼내오되, 값이 있으면 해당값, 값이 없으면 Default로 설정한 값
//            mp2.put(a, mp2.getOrDefault(a, 0)+1);
//        }
//        String answer2 = "";
//        for(String a : par){
//            if(!mp2.containsKey(a)) {
//                answer2 = a;
//                break;
//            } else {
//                if (mp2.get(a) > 1) mp2.put(a, mp2.get(a) - 1);
//                else if (mp2.get(a) == 1) mp.remove(a);
//            }
//        }
//        System.out.println(answer2);
//
//        // 내부적으로 정렬하고 싶으면 HashMap 말고 TreeMap
//        String[] aa = {"O형", "O형", "A형", "B형"};
//        Map<String, Integer> mp3 = new TreeMap<>();
//        for(String a : aa) {
//            mp3.put(a, mp3.getOrDefault(a, 0)+1);
//        } for(String a : mp3.keySet()){
//            System.out.println("혈액형" + a + " " + mp3.get(a) + "명");
//        }
//
//        // set: 중복을 알아서 제거해준다.
//        String[] class1 = {"kim", "lee", "choi", "kim", "lee"};
//        Set<String> set = new TreeSet<>();
//        for(String a : class1) {
//            set.add(a);
//        }

        // 교집합, 합집합, 차집합
        Set<Integer> set1 = new HashSet<>();
        // set1 : {1,2,3}, set2 : {2,3,4} 합집합 : 1,2,3,4 교집합 : 2,3 차집합(set1-set2) : 1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));

        // 합집합 : addAll
        set1.addAll(set2);
        System.out.println(set1);
        // 교집합 : retainAll
        set1.retainAll(set2);
        System.out.println(set1);
        // 차집합 : removeAll
        set1.removeAll(set2);
        System.out.println(set1);

        // 값을 더하는 것 : add, 제거하는 것 : remove
        // 여러 값을 한꺼번에 더할 때 : addAll

        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.addAll(Arrays.asList(20,30,40));
        System.out.println(set3);

        // stack 자료구조 : 후입선출
        Stack<String> st = new Stack<>();
        // 자료를 더하는 것은 push
        st.push("a1");
        st.push("a2");
        st.push("a3");
        // 자료를 꺼내는 것은 pop, 그런데 pop은 실제로 자료를 꺼내버리기 때문에,
        // peek을 사용해서 마지막 자료가 무엇인지만 확인을 할 수도 있다
        System.out.println(st.pop());
        System.out.println(st);


        int[] arr = {1,1,3,3,0,1,1};
        Stack<Integer> st1 = new Stack<>();
        for(int a : arr) {
            if(st1.isEmpty()){
                st1.push(a);
            } else {
                if(st1.peek() != a) {
                    st1.push(a);
                }
            }
        }
        int[] answer = new int[st1.size()];
//        int num = st1.size();
//        for(int i=num-1; i>=0; i--){
//            answer[i] = st1.pop();
//        }
        int num = 0;
        for(int a : st1){
            answer[num] = a;
            num ++;
        }
        System.out.println(Arrays.toString(answer));

    }
}