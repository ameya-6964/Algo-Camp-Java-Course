package Lecture_2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value : ");
        //take input from user
        int number = sc.nextInt();

        System.out.println("You entered " + number);

//        float myFloat = input.nextFloat();
//
//        double myDouble = input.nextDouble();
//
//        String myString = input.next();

        // next() -> read a word from the user
        //nextLine() -> read a line of text from user.
    }
}
