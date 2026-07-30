package Arrays.Easy;
import java.util.HashSet;

public class RemoveDuplicates{

    static int brute(int[] arr) {
        //HashSet stores unique elements
        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        for (int num : arr){
            //If num is not in the set, it is unique
            if (!set.contains(num)){
                //add num to the set
                set.add(num);

                //Stores unique element back into the array
                arr[index] = num;

                index++;
            }
        }
        // Return number of unique element
        return index;
    }

    static int optimal(int[] arr){
        //If array is empty
        if(arr.length == 0){
            return 0;
        }
        //i points to the last unique element
        int i = 0;

        //j scans the remaining array
        for(int j = 1; j < arr.length; j++){
            //If unique elements found
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        //Return total unique numbers
        return i + 1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,4,4};

        int uniqueCount = optimal(arr);

        System.out.println("Unique numbers in array: " + uniqueCount);
        System.out.println("Array after removing duplicates: ");

        for (int i = 0; i < uniqueCount; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Pattern:
Two Pointers

Brute Force:
Use a HashSet to store unique elements and copy them back.
Time: O(n)
Space: O(n)

Optimal:
Maintain two pointers:
i -> last unique element
j -> scanning pointer

Time: O(n)
Space: O(1)

Edge Cases:
- Empty array
- Single element
- All elements same
*/