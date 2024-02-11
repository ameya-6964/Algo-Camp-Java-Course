package Assignments;

import java.util.Scanner;

public class PrintDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Please Enter The Number From 0-6 Or Press 7 To Exit");
        int number = sc.nextInt();

        switch (number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Thank-you 😀");
                break;
            default:
                System.out.println("Enter Valid Number");
                break;
        }
        if (number == 7){
            break;
        }
        }
    }
}
