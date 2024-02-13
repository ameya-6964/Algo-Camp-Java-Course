package Assignments.Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("Please Enter The Character");
        char ch = sc.next().charAt(0);
        if(ch =='X' || ch=='x'){
            System.out.println("Thank-You For Using AlgoCamp Calculator");
            break;
        }
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        if(ch=='+'){
            System.out.println(a+b);
        } if(ch=='-'){
            if(a > b) System.out.println(a-b);
            System.out.println(b-a);
        }if(ch=='*'){
            System.out.println(a*b);
        }if(ch=='/'){
            System.out.println(a/b);
        }if(ch=='%'){
            System.out.println(a%b);
        }

    }


}
}
