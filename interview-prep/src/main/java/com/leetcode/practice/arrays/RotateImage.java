package com.leetcode.practice.arrays;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] myArray = {{5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
		 rotate(myArray);
	     System.out.println(Arrays.deepToString(myArray));
	}

	static void rotate(int[][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length) {
			return;
		}
		
		int n = matrix.length;
		
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			
			for(int i = first; i < last; i++) {
				int offset = i - first;
				
				int top = matrix[first][i];
				
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
 			}			
		}
	}
}
