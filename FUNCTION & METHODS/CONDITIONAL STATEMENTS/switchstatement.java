import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch(number){
            case 1: System.out.println("Samosa");
                    break;
            case 2: System.out.println("Burgur");
                    break;
            case 3: System.out.println("mango shake");
                    break;
            default: System.out.println("we make up");
        }
    }
}
