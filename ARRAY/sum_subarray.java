public class sum_subarray {

    public static void maxsubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;



        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currSum =0;

                for(int k=start; k<=end; k++){ // print
                    //System.out.print(numbers[k]+" "); // subarray
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        maxsubarray(numbers);
    }
}
