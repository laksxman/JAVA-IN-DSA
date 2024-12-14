import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("n is not prime");
        } else if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i * i <=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;  // No need to check further once we know n is divisible by i
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
    }
}
