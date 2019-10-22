package com.leetcode.practice.strings;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		// System.out.println(String.valueOf(-1/10));
		System.out.println(reverseInt(1534236469));
	}
	
	static int reverseInt(int x) {
		int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        
	        x = x/10;
	    }
	 
	    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
	        return 0;
	    } else {
	        return (int) rev;
	    }
	}

}
