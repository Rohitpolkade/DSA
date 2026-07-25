package Array.Easy;

import java.util.Arrays;

public class LargestElement{

    static int brute(int[] arr){
        // Sort the array in ascending order!
        Arrays.sort(arr);

        //Return the last element (largest element)
        return arr[arr.length - 1];
    }

    static int optimal(int[] arr, int n){
        //Initialize max with first element of array
        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){ // If the current element is greater than max, update

                max = arr[i];
            }
        }
        return max; // Return the largest element found
    }

    public static void main(String[] args){

        int[] arr = {2, 4, 5, 9, 7, 1};

        // Find Largest element through brute force approach
        int maxBrute = brute(arr);

        // Find Largest element through optimal approach
        int maxOptimal = optimal(arr, arr.length);

        System.out.println("Largest Element in the array is: " + maxOptimal);

    }
}