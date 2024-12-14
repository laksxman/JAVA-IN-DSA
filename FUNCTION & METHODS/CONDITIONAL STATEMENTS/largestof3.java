public class largestof3 {
    public static void main(String[] args) {
        int A = 1, B = 4, C = 6;

        if(A>B && B>C ){
            System.out.println("largest is A: "+A);
        }
        else if(B>C){
            System.out.println("largest is B: "+B);
        }
        else{
            System.out.println("largest is C: "+C);
        }
    }
}
