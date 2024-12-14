public class sub_array {

    public static void subarray(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                for(int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k]+" "); // subarray
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("total sub pairs: "+ts);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        subarray(numbers);
    }
}
