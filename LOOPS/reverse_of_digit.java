import java.util.Scanner;

public class reverse_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your digit: ");

        int N = sc.nextInt();
        int reversed =0;
        while(N!=0){
            int digit = N%10;
            reversed = reversed*10+digit;
            N/=10;
        }
        System.out.println("Reversed number: "+ reversed);

    }
}
