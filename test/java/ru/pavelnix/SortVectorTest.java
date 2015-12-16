package ru.pavelnix;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class whith test the class SortVector
 */
public class SortVectorTest {

    /**
     * Method test bubble sort for unsorted vector
     */
    @Test
    public void bubbleSortUnsortedVector() {
        //Arrange
        int[] unsortedVector = {4, 9, 2};
        SortVector vector = new SortVector(unsortedVector);
        int[] sortVector = {2, 4, 9};

        //Act
        int[] resultArray = vector.bubbleSortVector();

        //Assert
        assertThat(resultArray, is(sortVector));
    }
}