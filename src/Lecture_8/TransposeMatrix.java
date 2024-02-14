package Lecture_8;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {2,4,-1},
                {-10,5,11},
                {18,-7,6}
        };
    }
        public int [][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] newMatrix = new int [cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newMatrix[j][i] = matrix[i][j];
                }
            }
        return newMatrix;
    }
}
