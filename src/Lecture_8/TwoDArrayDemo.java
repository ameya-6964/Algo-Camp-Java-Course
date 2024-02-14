package Lecture_8;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println(arr[0][0]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter Element At i: " +i+" Position and j: "+ j +" Position");
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
    static void printArray(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Element At i = " + i +" Position and j = "+ j +" Position Is " + arr[i][j]);
            }
        }
    }
}
