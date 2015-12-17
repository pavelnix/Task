package ru.pavelnix;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortArrayTest{
	
	@Test
	public void bubbleSortUnsortedArray(){
		//Arrange
		int[] unsortedArray = {4, 9, 2};
		SortArray array = new SortArray(unsortedArray);
        int[] sortArray = {2, 4, 9};

        //Act
		int[] resultArray = array.bubbleSortArray();

        //Assert
        assertThat(resultArray, is(sortArray));
	}
	
	@Test
	public void bubbleSortAlreadSortedArray(){
		//Arrange
		int[] unsortedArray = {2, 4, 9};
		SortArray array = new SortArray(unsortedArray);
        int[] sortArray = {2, 4, 9};

        //Act
		int[] resultArray = array.bubbleSortArray();

        //Assert
        assertThat(resultArray, is(sortArray));
	}
}