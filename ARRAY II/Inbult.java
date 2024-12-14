import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;

public class Inbult {

    //for print the code
    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Integer arr[] = {2,4,3,5,1};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3)
        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr,0,3, Collections.reverseOrder());
        print(arr);


        // selectionsort(arr);
    }
}