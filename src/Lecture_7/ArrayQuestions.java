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
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void display(int[] arr) {
        System.out.println("Original Array "+Arrays.toString(arr));
    }
}
