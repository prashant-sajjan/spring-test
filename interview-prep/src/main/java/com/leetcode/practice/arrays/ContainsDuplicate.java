package com.leetcode.practice.arrays;

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length <=1 ) {
			return false;
		}
		
		boolean containsDuplicate = false;
		Arrays.sort(nums);
		
		int prev = nums[0];
		int current;
		
		for(int i = 1; i < nums.length; i++) {
			current = nums[i];
			if(prev == current) {
				containsDuplicate = true;
				break;
			}
			prev = current;
		}
		
		
		return containsDuplicate;
	}
}
