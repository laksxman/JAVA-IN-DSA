import java.util.Scanner;

public class printNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = 1;


        while(number<=N){
            System.out.println("number is: "+number+" ");
            number++;
        }
        System.out.println();
    }
}
