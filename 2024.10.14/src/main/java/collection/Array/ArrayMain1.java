package collection.Array;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        arr[2] = 10;
        int value = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            } else {
                System.out.println("arr[" + i + "] != " + arr[i]);
            }
        }
        System.out.println("결과 도출 완료");

        int a = 5;
        int b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println("a =" + a + ", b = " + b);

    }
}
