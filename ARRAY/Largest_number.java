import java.util.*;

public class Largest_number {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
            if(smallest> numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("samllest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,5,4};
        System.out.println("largest value is : "+getLargest(numbers));
    }
}
