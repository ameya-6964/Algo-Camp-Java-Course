package Assignments.Loops;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please Enter The Character");
            char ch = sc.next().charAt(0);
            if(ch =='0'){
                System.out.println("Thank-You");
                break;
            }
            if(ch >= 'A' && ch <= 'Z'){
                System.out.println("U");
            }
            else if(ch >= 'a' && ch <= 'z'){
                System.out.println("L");
            }
            else{
                System.out.println("Not Applicable");
            }
        }
    }
}
