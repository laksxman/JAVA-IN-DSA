public class printSpiralMatrix {

    public static void printSpiral(int[][] matrix){
        // int x =4;
        // int col = x;

        // // for(int row=0; row<matrix.length; row++){
        // for(int row=matrix.length-1; row>=0; row--){
        //     System.out.println(matrix[row][col]);
        // }

        int y=4;
        int row =y;

        for(int col=0; col<matrix.length; col++){
            System.out.println(matrix[row][col]);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printSpiral(arr);
    }
}
