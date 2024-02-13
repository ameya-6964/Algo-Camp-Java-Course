package Assignments.Loops;

public class FindSquareUsingLoops {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int answer = 1;
        for (int i = 0; i < b; i++) {
            answer *= a;
        }
        System.out.println(answer);

    }
}
