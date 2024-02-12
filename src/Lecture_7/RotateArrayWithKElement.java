package Lecture_7;
import static UtilityFunctions.PrintArray.display;
public class RotateArrayWithKElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        display(arr);
        int[] rotatedArray = rotate(arr,3);
        display(rotatedArray);
    }

    private static int[] rotate(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        if(k < 0){
            k = k + n;
        }
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1]; // Store the last element temporarily
            // Shift each element one position to the right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last; // Place the last element at the beginning
        }
        return arr;
    }

}


