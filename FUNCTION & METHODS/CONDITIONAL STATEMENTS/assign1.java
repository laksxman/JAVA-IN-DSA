import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
}
