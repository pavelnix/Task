package ru.pavelnix;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Matrix
 */
public class MatrixTest {

    /**
     * Method test rotation matrix 2X2 by 90 degrees
     */
    @Test
    public void rotationMatrix2X2By90Degrees() {
        //Arrange
        int[][] value = {
                {1, 2},
                {3, 4}
        };
        Matrix matrix = new Matrix(value);
        int[][] rotationMatrixResult = {
                {3, 1},
                {4, 2}
        };

        //Act
        int[][] rotationMatrix = matrix.rotationMatrix();

        //Assert
        assertThat(rotationMatrix, is(rotationMatrixResult));
    }

    /**
     * Method test rotation matrix 3X3 by 90 degrees
     */
    @Test
    public void rotationMatrix3X3By90Degrees() {
        //Arrange
        int[][] value = {
                {1, 2, 3},
                {9, 4, 5},
                {6, 7, 8}
        };
        Matrix matrix = new Matrix(value);
        int[][] rotationMatrixResult = {
                {6, 9, 1},
                {7, 4, 2},
                {8, 5, 3}
        };

        //Act
        int[][] rotationMatrix = matrix.rotationMatrix();

        //Assert
        assertThat(rotationMatrix, is(rotationMatrixResult));
    }
}