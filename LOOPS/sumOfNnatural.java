import java.util.Scanner;

public class sumOfNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int number = 1;


        while(number<=N){
            sum = sum+number;
            number++;
            
        }
        System.out.println("sum is: "+sum);
    }
}
