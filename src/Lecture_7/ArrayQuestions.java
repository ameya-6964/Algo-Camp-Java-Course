package Lecture_7;

import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};

        display(arr);
        reverse(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    private static void display(int[] arr) {
        System.out.println("Original Array "+Arrays.toString(arr));
    }
}
