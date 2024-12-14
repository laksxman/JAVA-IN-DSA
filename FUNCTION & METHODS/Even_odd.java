public class Even_odd {

    public static boolean evenodd(int n){
        boolean isEven = true;
        int num = n;
        if(num%2==0){
            return isEven;
        }else{
            return false;
        }
    }




    public static void main(String[] args) {
        System.out.println("number is Even: "+evenodd(5));
    }
}
