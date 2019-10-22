package com.prashant.ds.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {9, 6, 1, 4, 12};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	private static int[] bubbleSort(int[] numbers) {
		int length = numbers.length - 1;
		for(int i = 0; i < length; i++) {
			for(int j=0; j < length-i; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}
}
