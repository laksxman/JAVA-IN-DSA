public class pattern {
    public static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(4);
    }
}
