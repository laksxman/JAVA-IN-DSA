import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your digits: ");
        long N = sc.nextLong();

        int count = 0;
        while(N!=0){
            N/=10;
            count++;

        }
        System.out.println("Number of digits: "+ count);
    }
}
