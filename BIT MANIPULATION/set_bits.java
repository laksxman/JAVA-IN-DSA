public class set_bits {

    public static int set_bit(int n){
        int count=0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n = n>>1;
        }
        return count++;
    }
    public static void main(String[] args) {
        System.out.println(set_bit(15));
        System.out.println(set_bit(8));
        System.out.println(set_bit(5));
    }
}
