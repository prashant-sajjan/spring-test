package com.leetcode.practice.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = removeDuplicates(new int[] {1,1,2,2,3,4,5,5});
		System.out.println(ArrayUtils.toString(arr));
		
		System.out.println(removeDuplicatesReturnLength(arr));
	}

	public static int[] removeDuplicates(int[] nums) {
        
        int prev, current;
        int index, length;
        
        prev = nums[0];
        index = 1;
        length = nums.length;
        
        while(index < length) {
        	current = nums[index];
        	if(prev == current) {
        		
        		nums = ArrayUtils.remove(nums, index);
        		length = nums.length;
        	} else {
        		prev = current;
        		index++;
        	}
        }
        
        return nums;
    }
	
	public static int removeDuplicatesReturnLength(int[] nums) {
		
		if(nums.length < 2 ) {
			return nums.length;
		}
		
		int i = 1;
		int j = 0;
		
		while(i < nums.length) {
			if(nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
			i++;
		}
		
		return j + 1;
	}
}
