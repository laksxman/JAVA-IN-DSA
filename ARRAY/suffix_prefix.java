public class suffix_prefix {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int n= nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]* nums[i];
        }

        suffix[n-1] = nums[n-1];
        for(int i= n-2; i>=0; i--){
            suffix[i] = suffix[i+1]* nums[1];
        }
        System.out.println(prefix[3]);
        // System.out.println(suffix[1]);

        
    }
}
