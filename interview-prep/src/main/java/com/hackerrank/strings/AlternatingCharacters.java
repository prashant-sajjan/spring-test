package com.hackerrank.strings;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alternatingCharacters("ABABABAB"));
	}

	static int alternatingCharacters(String s) {
		char prev  = 0;
	    int  count = 0;

	    for (char c : s.toCharArray()) {
	        if (c == prev) {
	            count++;
	        } else {
	            prev = c;
	        }
	    }
	    return count;
    }
	
}
