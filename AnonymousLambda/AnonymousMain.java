package AnonymousLambda;

import java.util.Arrays;

public class AnonymousMain {
    public static void main(String[] args) {

    Anonymous a2 = new Anonymous() {
        private int num = 2;

        @Override
        public int getNum() {
            return this.num;
        }
    };

    AnimalInterface ai1 = new AnimalInterface() {
        @Override
        public void cry() {
            System.out.println("야옹야옹");
        }

        @Override
        public void cry2(String a) {

        }
    };

    String[] arr = {"abc","bcd","ddd"};
        Arrays.stream(arr).filter(a->a.length()>=5 && a.length()<=10)
                .map(String::toUpperCase).findFirst().orElse("없음");

    }
}