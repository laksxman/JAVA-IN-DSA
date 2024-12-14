public class shortedArray {
    public static void main(String[] args) {
        int [] arr = {2,4,6,3,7,5,9,8};
        int n = arr.length;

        int maxElement = 0;

        for(int i=0; i<n-1; i++){
            if(arr[i] >maxElement){
                maxElement = arr[i];
            
            }
        }

        int count[] = new int[ maxElement+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        for(int i= maxElement; i>=0; i--){
            int freq = count[i];
            while (freq>0) {
                System.out.println(i+ " ");
                freq--;
            }
        }
    }
}
