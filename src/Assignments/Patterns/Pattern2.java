package Assignments.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n =3;

        int trows = n;
        int spaces = n-1;
        int stars = 1;
        for (int row = 1; row <= trows ; row++) {
            // Work For Current Row
            //spaces
            for (int csp =1 ;csp <= spaces;csp++){
                System.out.print(" ");
            //stars
            } for (int cst =1 ;cst <= stars;cst++){
                System.out.print("*");
            }
            //Prep For Next Row;
            System.out.println();
            spaces--;
            stars+=2;
        }
    }
}
