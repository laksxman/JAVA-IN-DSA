public class insertion_sort {

    public static void selectionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            // finding out the correct pos to insert
            while(previous>=0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            // insertion
            arr[previous+1] = current;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,4};
        selectionsort(arr);

    }
}
