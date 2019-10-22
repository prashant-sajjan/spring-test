package com.hackerrank.arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		n = -n; // for left rotation
		n = n % length;
		
		if(n < 0) {
			n = n + length;
		}
		
		reverseArray(arr, 0, length-1);
		reverseArray(arr, 0, n-1);
		reverseArray(arr, n, length-1);
	}
}
