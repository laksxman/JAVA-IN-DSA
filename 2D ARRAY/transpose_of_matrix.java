public class transpose_of_matrix {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {{2,3,7},{5,6,7}};

        printMatrix(matrix);

        // Transpose the matrix
        int [][] tranpose = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                tranpose[j][i] = matrix[i][j];
            }
        }

        // print the tranpose matrix
        printMatrix(tranpose);

    }

    public static void printMatrix(int[][] matrix){
        System.out.println("Transpose matrix is: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
