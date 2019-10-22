package com.hackerrank.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoStrings("hi", "world"));
	}

	static String twoStrings(String s1, String s2) {
		
		Map<Character, Boolean> map = new HashMap<>();
		
		for(char ch : s1.toCharArray()) {
			map.put(ch, true);
		}
		
		for(char ch : s2.toCharArray()) {
			if(map.containsKey(ch)) {
				return "YES";
			}
		}
		return "NO";
	}
}
