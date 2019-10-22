package com.leetcode.practice.arrays;

import java.util.Arrays;

public class SingleClass {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,1,2,1,2,}));
		System.out.println(singleNumberXOR(new int[] {4,1,2,1,2,}));
	}
	
	static int singleNumber(int[] nums) {
		int singleNumber = -1;
		Arrays.sort(nums);
		int i = 0;
		
		while((i+1) < nums.length) {
			if(nums[i] != nums[i+1]) {
				singleNumber = nums[i];
				break;
			}
			i = i +2;
		}
		
		if(i == nums.length -1) {
			singleNumber = nums[i];
		}
		
		return singleNumber;
	}
	
	
	static int singleNumberXOR(int[] nums) {
		int res = 0;
		for (int num : nums) {
			res = res ^ num;
		}
		return res;
	}

}
