public class update_bit {

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int updateIthBIt(int n, int i, int NewBIt){
        if(NewBIt ==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthBIt(7, 3, 1));
        System.out.println(updateIthBIt(7, 3, 0));
    }
}
