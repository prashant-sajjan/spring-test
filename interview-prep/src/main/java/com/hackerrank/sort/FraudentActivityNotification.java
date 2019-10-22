package com.hackerrank.sort;

import java.util.Arrays;

public class FraudentActivityNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(activityNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
	}
	
	 static int activityNotifications(int[] expenditure, int d) {
	        int[] counts = new int[201];
	        for (int i = 0; i < d; i++) {
	            counts[expenditure[i]]++;
	        }
	        System.out.println("count array : "+ Arrays.toString(counts));
	        int result = 0;
	        for (int i = d; i < expenditure.length; i++) {
	            int lower = 0;
	            int leftNum = 0;
	            System.out.println("==============================");
	            while ((leftNum + counts[lower]) * 2 <= d) {
	            	System.out.println("while condition inside"+ (leftNum + counts[lower]) * 2);
	                leftNum += counts[lower];
	                lower++;
	            }
	            System.out.println("while condition outside"+ (leftNum + counts[lower]) * 2);
	            
	            System.out.println("LeftNum "+leftNum);
	            System.out.println("Lower "+lower);
	            
	            int upper = counts.length - 1;
	            int rightNum = 0;
	            while ((rightNum + counts[upper]) * 2 <= d) {
	                rightNum += counts[upper];
	                upper--;
	            }

	            System.out.println("while condition outside "+ (rightNum + counts[upper]) * 2 );
	            System.out.println("rightNum "+rightNum);
	            System.out.println("upper "+upper);
	            System.out.println("==============================");
	            if (expenditure[i] >= lower + upper) {
	                result++;
	            }

	            counts[expenditure[i - d]]--;
	            counts[expenditure[i]]++;
	            System.out.println("count array : "+ Arrays.toString(counts));
	        }
	        return result;

	    }

}
