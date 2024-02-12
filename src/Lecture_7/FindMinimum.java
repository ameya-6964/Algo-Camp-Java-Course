package Lecture_7;

import UtilityFunctions.PrintArray.*;

import static UtilityFunctions.PrintArray.display;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr ={45,23,12,412,12,124};
        display(arr);
        int minimum = findMinimum(arr);
        int maximum = findMaximum(arr);
        System.out.println("Minimum Element In Array Is " + minimum);
        System.out.println("Maximum Element In Array Is " + maximum);
    }
    static int findMinimum(int[] arr){
        int minimum = Integer.MAX_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    } static int findMaximum(int[] arr){
        int maximum = Integer.MIN_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
