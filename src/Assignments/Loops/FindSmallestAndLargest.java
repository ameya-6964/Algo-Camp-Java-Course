package Assignments.Loops;

import java.util.Scanner;

public class FindSmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int largest = 0;
        for (; number > 0 ; number /= 10) {
            int lastDigit = number % 10;
            if(lastDigit < smallest){
                smallest = lastDigit;
            }
            if(lastDigit > largest){
                largest = lastDigit;
            }
        }
        System.out.println("Largest "+ largest);
        System.out.println("Smallest "+ smallest);
    }
}
