package com.leetcode.practice.arrays;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[]{0,1,0,3,12};
		moveZeroesRight(v);
	    System.out.println("Original Array: "+Arrays.toString(v));
	}
	
	private static void moveZeroesRight(int[] nums) {
		if(nums == null) {
			return ;
		}
		
		int readIndex =0;
		int writeIndex = 0;
		
		while(readIndex < nums.length) {
			if(nums[readIndex] != 0) {
				nums[writeIndex] = nums[readIndex];
				writeIndex++;
			}
			readIndex++;
		}
		
		while(writeIndex < nums.length) {
			nums[writeIndex] = 0;
			writeIndex++;
		}
	}

}
