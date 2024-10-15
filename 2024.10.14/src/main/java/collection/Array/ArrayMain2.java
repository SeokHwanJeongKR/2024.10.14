package collection.Array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한 칸 씩 뒤로 밀고 배열의 첫번쨰 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        System.out.println("arr.length = " + arr.length);
        System.out.println();
        System.out.println("구현 존나 어렵다");
        System.out.println();

        addFirst(arr, newValue);
        System.out.println("첫번쨰 추가 : " + Arrays.toString(arr));
        System.out.println();

        remove(arr, newValue);
        System.out.println("첫번쨰 삭제 : " + Arrays.toString(arr));
        System.out.println();

        addFirst(arr, newValue);
        System.out.println("첫번쨰 추가 : " + Arrays.toString(arr));
        System.out.println();

        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 밀고 배열의 첫번째 위치에 추가
        // arr[i]  b  추가 숫자 4
        /*     0   1                    1        i0 = i0
        *      1   2           4        4        i1 = 4
        *      2   0                    2        i2 = i1
        *      3   0                    0        i3 = i2
        *      4   0                    0        i4 = i3
           arr.length = 5;
        * */

        addAtIndex(arr, 2, 4);
        System.out.println("중간 추가 : " + Arrays.toString(arr));
        System.out.println();
        addLast(arr, 5);
        System.out.println("마지막 추가 : " + Arrays.toString(arr));
    }
    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index ; i--) {
            arr [i] = arr [i - 1];
        }
        arr[index] = newValue;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr [0] = newValue;
    }

    private static void remove(int[] arr , int b) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

    }
    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }
}
