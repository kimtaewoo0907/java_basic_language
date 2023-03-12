package java_basic_grammer;

import java.util.Arrays;

public class RecursiveCall2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        // 위 배열을 2개의 숫자로 조합할 수 있는 경우의 수를 나열하라
        // 단 10,20 과 20,10은 같은 것으로 판단한다.
//        int[] arr_temp = new int[2];
//            for(int i=0; i<arr.length; i++){
//                arr_temp[0] = arr[i];
//                for(int j = i+1; j<arr.length; j++){
//                    arr_temp[1] = arr[j];
////                    System.out.println(Arrays.toString(arr_temp));
////                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        int[] arr_tp = new int[3];
//            // 위 배열을 3개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//            for(int i=0; i<arr.length-1; i++){
//                arr_tp[0] = arr[i];
//                for(int j=i+1; j<arr.length; j++){
//                    arr_tp[1] = arr[j];
//                    for(int k=j+1; k<arr.length; k++){
//                        arr_tp[2] = arr[k];
//                        System.out.println(Arrays.toString(arr_tp));
////                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//                }
//            }
//        }

    // 3개짜리 조합을 출력하는 재귀함수 호출
        recur(arr, new int[3], 0, 0);
    }
    static void recur(int[] arr, int[] arr_temp, int a, int ijk){
        if(a == arr_temp.length) {
            System.out.println(Arrays.toString(arr_temp));
            return;
        }
        for(int i=ijk; i<arr.length; i++){
            arr_temp[a] = arr[i];
            recur(arr,arr_temp, a+1, i+1);
        }
    }
}
