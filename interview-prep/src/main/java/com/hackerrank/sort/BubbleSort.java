package com.hackerrank.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 static void countSwaps(int[] a) {
		    int length = a.length - 1;
		    int swapCnt = 0;
		        for(int i = 0; i < length; i++) {
		            for(int j=0; j < length-i; j++) {
		                if(a[j] > a[j+1]) {
		                    int temp = a[j+1];
		                    a[j+1] = a[j];
		                    a[j] = temp;
		                   swapCnt++; 

		                }
		            }
		        }
		        System.out.println("Array is sorted in "+swapCnt+" swaps.");
		        System.out.println("First Element: "+a[0]);
		        System.out.println("Last Element: "+a[length]);

		    }


}
