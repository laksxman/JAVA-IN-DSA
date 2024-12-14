// import java.sql.Array;
import java.util.Arrays;

public class selection_sort {

    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

//for print the code
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3)
        print(arr);


        // selectionsort(arr);
    }
}
