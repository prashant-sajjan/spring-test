package com.hackerrank.arrays;

import java.util.Arrays;

public class MinimunSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []a = {1, 3 , 5 , 2 , 4 , 6 , 7}; 
		  System.out.println(Arrays.toString(a));
		  System.out.println(minimumSwaps(a));
	}
	
	static int minimumSwaps(int[] arr) {
        int n = arr.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            if (i < arr[i] - 1) {
                swap(arr, i, arr[i] - 1);
                minSwaps++;
                i--;
                System.out.println(Arrays.toString(arr));
            }
        }
        return minSwaps;

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
