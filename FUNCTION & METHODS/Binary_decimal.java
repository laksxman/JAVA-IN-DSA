public class Binary_decimal {

    public static void binTodec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum =  decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of "+ myNum +" is: " +decNum);
    }


    public static void main(String[] args) {
        binTodec(1000);
        
    }
}
