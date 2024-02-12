package Assignments;

public class FindSecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1221,2,124,12,13,234,432};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Element Is " + secondLargest);
    }
    public static int findSecondLargest(int[] arr){
        int length = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i=0;i<length;i++){
            if(arr[i] > largest){
               secondlargest = largest;
               largest = arr[i];
            } else if (arr[i]>secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
