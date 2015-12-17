package ru.pavelnix;

public class SortArray{
	private final int[] vector;
	
	public SortArray(int[] vector){
		this.vector = vector;
	}
	
	public int[] bubbleSortArray(){
		int[] sortVector = new int[vector.length];
		System.arraycopy(vector, 0, sortVector, 0, vector.length);
		
		for (int i = 1; i <= sortVector.length - 1; i++){
			for(int j = 1; j <= sortVector.length - i; j++){
				if (sortVector[j] < sortVector[j - 1]){
					int temp = sortVector[j];
					sortVector[j] = sortVector[j - 1];
					sortVector[j - 1] = temp;
				}
			}
		}
		return sortVector;
	}
}