public class bubble_sort {

    public static void bubblesort(int arr[] ){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int turn=0; turn<arr.length; turn++){
            System.out.print(arr[turn]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        bubblesort(arr);
    }
}