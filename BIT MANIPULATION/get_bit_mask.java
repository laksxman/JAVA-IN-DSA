public class get_bit_mask {

    

    public static int getBitMask(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getBitMask(10,2 ));
    }
}
