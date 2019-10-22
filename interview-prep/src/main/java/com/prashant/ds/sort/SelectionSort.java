package com.prashant.ds.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] {9, 6, 1, 4, 12};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
	
	private static int[] selectionSort(int[] numbers) {
		int length = numbers.length;
		for(int i = 0; i < length-1; i++) {
			int min_index = i;
			for(int j = i+1; j < length; j++) {
				if(numbers[j] < numbers[min_index]) {
					min_index = j;
				}
			}
			int temp = numbers[min_index];
			numbers[min_index] = numbers[i];
			numbers[i] = temp;
		}
		return numbers;
	}
}
