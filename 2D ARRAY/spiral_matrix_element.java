public class spiral_matrix_element {

    public static void printMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endrow = matrix.length;
        int endCol = matrix[0].length;
        
        while(startRow < endrow && startCol < endCol){
            //top
            for(int j=startCol; j<endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endrow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }

            //left
            for(int i=endrow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endrow--;
            endCol--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printMatrix(matrix);
    }
}
