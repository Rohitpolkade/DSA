package Arrays.Easy;

import java.util.Arrays;

public class SecondLargestElement {

    static int brute(int[] arr, int n){

        //Edge case: when the array has less than 2 elements
        if (n < 2){
            return -1;
        }
        // Sort the array in ascending order!
        Arrays.sort(arr);

        //Find second distinct largest
        for (int i = n - 2; i >= 0; i--){
            if (arr[i] != arr[n - 1]){
                return arr[i];
            }
        }
        return -1; // All elements are the same
    }

    static int optimal(int[] arr, int n){

        //Edge case
        if(n < 2){
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){

            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // If All elements are same
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args){

        int[] arr = {2, 3, 1, 4, 5, 4};

        int secLargestBrute = brute(arr, arr.length);
        int secLargestOptimal = optimal(arr, arr.length);

        if (secLargestBrute == -1) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element: " + secLargestBrute);
        }

        if (secLargestOptimal == -1) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element: " + secLargestOptimal);
        }
    }
}

/*
Pattern: Array Traversal

Brute Force:
1. Sort the array.
2. Traverse backwards to find the first element different from the largest.

Optimal:
1. Maintain two variables:
   - largest
   - secondLargest
2. Update them in one traversal.

Time Complexity:
Brute  -> O(n log n)
Optimal -> O(n)

Space Complexity:
Brute  -> O(1) (Ignoring sorting implementation details)
Optimal -> O(1)

Edge Cases:
- Empty array
- Single element
- All elements equal
- Negative numbers
*/