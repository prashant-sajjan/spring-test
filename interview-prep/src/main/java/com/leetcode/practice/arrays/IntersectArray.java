package com.leetcode.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class IntersectArray {

	public static void main(String[] args) {
		int[] result = intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		int[] result2 = intersectMap(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		System.out.println(ArrayUtils.toString(result));
		System.out.println(ArrayUtils.toString(result2));
	}
	
	private static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i = 0;
		int j = 0;
		List<Integer> result = new ArrayList<>();
		
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]) {
				result.add(nums1[i]);
				i++;
				j++;
			} else if(nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		return listToArray(result);
	}
	
	private static int[] intersectMap(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int num: nums1) {
			if(map.containsKey(num)) {
				int freq = map.get(num);
				map.put(num, freq + 1);
			} else {
				map.put(num, 1);
			}
		}
		
		List<Integer> result = new ArrayList<>();
		for(int num : nums2) {
			if(map.containsKey(num) && map.get(num) > 0) {
				result.add(num);
				int freq = map.get(num);
				freq--;
				map.put(num, freq);
			}
		}
		
		return listToArray(result);
	}
	
	private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
         
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
         
        return result;
    }
}
