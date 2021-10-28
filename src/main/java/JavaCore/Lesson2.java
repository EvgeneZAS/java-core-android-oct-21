package JavaCore;

import java.util.Arrays;

public class Lesson2 {


    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arrChange(arr);
        System.out.println(Arrays.toString(arr));
  //      arrFillIn(arr2);
  //      System.out.println(Arrays.toString(arr2));
        method6();
        System.out.println(Arrays.toString(a));

    }
    //1
    static void arrChange(int [] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }
    //2
    static void arrFillIn(int [] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
    }
    //3
    static void method6() {
        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
    }


}
