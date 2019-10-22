package com.leetcode.practice.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class RotateArrayInline {

	public static void main(String[] args) {
		int[] arr =new int[] {1, 2, 3, 4, 5};
	    System.out.println("Array Before Rotation\n"+ ArrayUtils.toString(arr));
	    rotateArrayInPlace(arr, 2);
	    System.out.println("Array After Rotation\n"+ArrayUtils.toString(arr));

	}

	static void reverseArray(int[] arr, int start, int end) {
		while(start <  end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void rotateArrayInPlace(int[] arr, int n) {
		int length = arr.length;
		
		n = n % length;
		
		if(n < 0) {
			n = n + length;
		}
		
		reverseArray(arr, 0, length-1);
		reverseArray(arr, 0, n-1);
		reverseArray(arr, n, length-1);
	}
}
