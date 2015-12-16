package ru.pavelnix;

/**
 * Class is designed to sort the vector
 */
public class SortVector {
    private final int[] vector;

    /**
     * Class constructor
     *
     * @param vector - input vector
     */
    public SortVector(int[] vector) {
        this.vector = vector;
    }

    /**
     * Method bubble sort of vector
     *
     * @return - sorted vector
     */
    public int[] bubbleSortVector() {
        int[] sortVector = new int[vector.length];
        System.arraycopy(vector, 0, sortVector, 0, vector.length);

        for (int i = 1; i <= sortVector.length - 1; i++) {
            for (int j = 1; j <= sortVector.length - i; j++) {
                if (sortVector[j] < sortVector[j - 1]) {
                    int temp = sortVector[j];
                    sortVector[j] = sortVector[j - 1];
                    sortVector[j - 1] = temp;
                }
            }
        }
        return sortVector;
    }
}