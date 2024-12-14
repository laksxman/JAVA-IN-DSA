import java.util.Scanner;
import java.util.*;

public class input_formUser {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n]; // Declaring an array of size n

        System.out.println(" enter element: ");
        for(int i = 0; i<n; i++){ // loop to take inputs
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is Displayed: ");
        for(int i=0; i<arr.length; i++){   // Loop to display array elements
            System.out.print(arr[i]+" ");
        }
    }
}
