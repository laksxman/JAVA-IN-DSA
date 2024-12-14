public class clear_last_Ith {

    public static int clearLastIthBit(int n, int i){
        int bitMask = (-1)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(7, 3));
        System.out.println(clearLastIthBit(15, 2));
    }
}
