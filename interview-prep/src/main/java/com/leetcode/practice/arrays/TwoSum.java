package com.leetcode.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] v = new int[]{2, 1, 8, 4, 7, 3};
		int[] result = twoSumZeroMS(v, 3);
		System.out.println(Arrays.toString(result));
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> foundValues = new HashMap<>();
		int[] retVal = new int[2];
		for(int i = 0; i < nums.length; i++) {
			if(foundValues.containsKey(target - nums[i])) {
				retVal[0] = foundValues.get(target - nums[i]);
				retVal[1] = i;
				return retVal;
			}
			foundValues.put(nums[i],i);
		}
		return new int[] {-1, -1};
	}
	
	public static int[] twoSumZeroMS(int[] nums, int target) {
        int max= 2047;
        int temp;
        int[] test=new int[max+1];
        for(int i=0;i<nums.length;i++){
            temp=(target-nums[i])&max;
            if(test[temp]!=0){
                return new int[]{test[temp]-1, i};
            }
            test[nums[i]&max] =i+1;
        }
        
        return new int[]{};
    }
}
