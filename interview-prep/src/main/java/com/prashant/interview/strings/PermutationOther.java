package com.prashant.interview.strings;

import java.util.Arrays;

public class PermutationOther {

	public static void main(String[] args) {
		//System.out.println(permutation("dam", "mda"));
		System.out.println(permutationCharCount("dama", "aamd"));
	}
	
	private static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	private static boolean permutation(String s, String t) {
		if(s.length() != t.length()) return false;
		
		return sort(s).equals(sort(t));
	}
	
	
	private static boolean permutationCharCount(String s, String t) {
		if(s.length() != t.length()) return false;
		
		int[] letters = new int[128]; //Assumption ASCII
		
		for(int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
			
			if(letters[t.charAt(i)] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
