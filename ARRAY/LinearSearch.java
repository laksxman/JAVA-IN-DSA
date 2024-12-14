import java.util.Scanner;

public class LinearSearch {
    
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int target= 10;

        int target_element = linearSearch(arr, target);

        if(target==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: "+ target_element);
        }
    }
}
