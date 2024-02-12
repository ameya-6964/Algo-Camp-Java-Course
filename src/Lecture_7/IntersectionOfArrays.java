package Lecture_7;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1= {10,19,20,30,40,40,40,50};
        int[] arr2 ={15,16,17,18,20,25,30,30,40};

        //Expected Output  [20,30,40]
        // Arrays Should Be Sorted
        // Array Length Can be Different

        ArrayList<Integer> intersectedArrays = new ArrayList<>();
        intersectedArrays = intersectArray(arr1,arr2);
        System.out.println(intersectedArrays);
    }

    public static ArrayList<Integer> intersectArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> output = new ArrayList<>();

        while (i < arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
            else{
                output.add(arr1[i]);
                i++;
                j++;
            }
        }
        return  output;
    }
}
