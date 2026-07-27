package Arrays.Easy;

public class SortedArray{

    static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                return false; // If any element is smaller than the previous one, return false
            }
        }
        return true; // If the array is sorted
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        //Output!
        System.out.println(isSorted(arr) ? "True" : "False");
    }
}