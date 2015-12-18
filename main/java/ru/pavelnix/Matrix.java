package ru.pavelnix;

/**
 * Class Matrix
 */
public class Matrix {
    private int[][] matrix;

    /**
     * Constructor
     *
     * @param matrix -
     */
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Method is rotation matrix by 90 degree
     *
     * @return rotation matrix
     */
    public int[][] rotationMatrix() {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        int halfLehgth = matrix.length / 2;

        if (matrix.length % 2 == 1) {
            resultMatrix[halfLehgth][halfLehgth] = matrix[halfLehgth][halfLehgth];
        }

        for (int i = 0; i < halfLehgth; i++) {
            for (int j = i; j < matrix.length - j; j++) {
                resultMatrix[j][matrix.length - 1 - i] = matrix[i][j];
                resultMatrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                resultMatrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                resultMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return resultMatrix;
    }
}