package com.hackerrank.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> longs = new ArrayList<Long>();
		longs.add(1L);
		longs.add(5L);
		longs.add(5L);
		longs.add(25L);
		longs.add(125L);
		System.out.println(countTriplets(longs, 5));
	}
	
	static long countTriplets(List<Long> arr, long r) {
		
		long ans = 0;
        Map<Long, Long> right = new HashMap<>();
        Map<Long, Long> left = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            right.put(arr.get(i), 0l);
            left.put(arr.get(i), 0l);
        }

        for (int i = 0; i < arr.size(); i++) {
            Long num = arr.get(i);
            right.put(num, right.get(num) + 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            Long num2 = arr.get(i);;
            right.put(num2, right.get(num2) - 1);
            System.out.println("num2 : " +num2);
            if (num2 % r == 0) {
                Long num1 = num2 / r;
                Long num3 = num2 * r;
                System.out.println("num1 : " +num1);
                System.out.println("num3 : " +num3);
                if (left.containsKey(num1) && right.containsKey(num3)) {
                	
                	System.out.println("===================");
                	System.out.println("num1 left " +left.get(num1));
                	System.out.println("num3 left " +right.get(num3));
                	System.out.println("===================");
                    ans += (left.get(num1) * right.get(num3));
                    System.out.println("sum is " +ans);
                    System.out.println(".....................");
                    Long leftCnt = left.get(num1);
                    Long rightCnt = right.get(num3);
                    
                    while(leftCnt > 0 || rightCnt > 0) {
                    	System.out.println(num1 + " , " + num2 + " , " + num3);
                    	rightCnt--;
                    	leftCnt--;
                    }
                }
            }

            left.put(num2, left.get(num2) + 1);
            System.out.println("left get "+num2 + " is " +left.get(num2));
        }
        
        return ans;
    }

}
