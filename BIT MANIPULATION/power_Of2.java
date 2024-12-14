public class power_Of2 {

    public static boolean isPOwerOfTwo(int n){
        return (n&(n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.println(isPOwerOfTwo(7));
        System.out.println(isPOwerOfTwo(8));
    }
}
