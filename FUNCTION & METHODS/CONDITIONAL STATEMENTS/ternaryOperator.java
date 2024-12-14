public class ternaryOperator {
    public static void main(String[] args) {
        int number = 4;

        String type =  ((number%2 ==0)?"even":"odd");
        System.out.println(type);


        int larger = ((5>3)? 5:3);
        System.out.println(larger);

        String type2 = ((5%2 == 0)?"even":"odd");
        System.out.println(type2);

        int marks= 45;
        String status = (marks>33)?"Pass":"Fail";
        System.out.println(status);

    }
}
