package com.leetcode.practice.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class RotateArrayTemp {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
	    System.out.println("Array Before Rotation\n"+ArrayUtils.toString(arr1));
	    rotateUsingTemp(arr1, 2);
	    System.out.println("Array After Rotation\n"+ArrayUtils.toString(arr1));
	    
	    arr1 = new int[] {1, 2, 3, 4, 5};
	    System.out.println("Array Before Rotation\n"+ArrayUtils.toString(arr1));
	    rotateUsingTemp(arr1, -3);
	    System.out.println("Array After Rotation\n"+ArrayUtils.toString(arr1));
	}
	
	static void rotateUsingTemp(int[] arr, int n) {
		int len = arr.length;
		
		n = n % len;
		
		if(n < 0) {
			n = n + len;
		}
		
		int[] temp = new int[n];
		
		for(int i = 0; i < n; i++) {
			temp[i] = arr[len-n+i];
		}
		
		for(int i = len-1; i >=n; i--) {
			arr[i] = arr[i-n];
		}
		
		for(int i = 0; i < n ; i++) {
			arr[i] = temp[i];
		}
	}

}
