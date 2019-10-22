package com.prashant.ds.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] data = {7,3,6,8,2};
		System.out.println(Arrays.toString(sort(data)));
	}
	
	private static int[] sort(int[] a) {
		for(int i=0; i < a.length; i++) {
			int j = i-1;
			int current = a[i];
			while(j>=0 && a[j] > current) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
		return a;
	}
}
