package com.leetcode.practice.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = plusOne(new int[] {4,3,2,1});
		System.out.println(ArrayUtils.toString(result));
		result = plusOne(new int[] {1,9,8,9});
		System.out.println(ArrayUtils.toString(result));
		result = plusOne(new int[] {9,9,9,9});
		System.out.println(ArrayUtils.toString(result));
	}
	
	private static int[] plusOne(int[] digits) {
		for(int i = digits.length-1; i > 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0; //carry handled by next iteration in for loop
		}
		
		 //didn't return yet so digits were all 9's
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
}
