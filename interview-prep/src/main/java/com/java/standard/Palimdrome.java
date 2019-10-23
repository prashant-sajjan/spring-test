package com.java.standard;

public class Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPalindromString(String input) {
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1))
				return false;
		}
		return true;
	}
}
