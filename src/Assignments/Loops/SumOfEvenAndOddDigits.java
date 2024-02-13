package Assignments.Loops;

import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfOdd=0;
        int sumOfEven=0;

        for (;number>0;number /= 10){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sumOfEven += lastDigit;
            }
            if(lastDigit % 2 == 1){
                sumOfOdd += lastDigit;
            }
        }
        System.out.print(sumOfOdd+" ");
        System.out.print(sumOfEven);

    }
}
