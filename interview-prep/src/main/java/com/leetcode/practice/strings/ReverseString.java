package com.leetcode.practice.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] strArr = new char[] {'h','e','l','l','o'};
		reverseString(strArr);
		System.out.println(strArr);
	}

	static void reverseString(char[] s) {
		int len = s.length;
		for(int i = 0; i < len/2; i++) {
			char temp = s[len-1- i];
			s[len-1- i] = s[i];
			s[i] = temp;
		}
	}
}
