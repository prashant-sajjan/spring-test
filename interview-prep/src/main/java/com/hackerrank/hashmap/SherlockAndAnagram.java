package com.hackerrank.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("abca".substring(1, 2));
		System.out.println(sherlockAndAnagrams("abba"));
	}

	static int sherlockAndAnagrams(String s) {
	    int n = s.length();
	    
	    //This will control the length of each substring each pass.
	    //For the first pass, it will 1(every single character), next 2, every 2 blocks of characters etc..
	    int I = 1;

	    int numOfAnagrams = 0;

	    //Looping through n - 1 (number of substrings).
	    //2nd loop, looks at each substring for each length.
	    //3rd loop loops through the rest of the substrings of the same length as s1.
	    for(int i = 0; i < n - 1; i++) {
	    	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
	    	System.out.println("i : " +i);
	        for(int j = 0; j <= n-I; j++) {
	        	System.out.println("j : " +j);
	            String s1 = s.substring(j, j + I);
	            System.out.println("s1 : " +s1);
	            for(int k = j+1; k <= n-I; k++) {
	            	System.out.println("k : " +k);
	                String s2 = s.substring(k, k + I);
	                System.out.println("s2 : " +s2);
	                if(checkAnagrams(s1, s2))
	                    numOfAnagrams++;
	            }
	        }
	        I++;
	        
	        System.out.println("I : " +I);
	        System.out.println("==========================================");
	        
	    }
	    return numOfAnagrams;
	}

	static boolean checkAnagrams(String s1, String s2) {
	    
	    //Creating 2 HashMaps to hold each char of strings and their frequncies, then checking  if they are equal or not. If they are equal, they are anagrams.
//	    Map<Character, Integer> s1Map = new HashMap<>();
//	    Map<Character, Integer> s2Map = new HashMap<>();
//	    
//	    char[] s1Chars = s1.toCharArray();
//	    char[] s2Chars = s2.toCharArray();
//
//	    //s1 and s2 will be coming in as the same length.
//	    for(int i = 0; i < s1.length(); i++) {
//	        Character s1Char = Character.valueOf(s1Chars[i]);
//	        Character s2Char = Character.valueOf(s2Chars[i]);
//
//	        if(s1Map.containsKey(s1Char))
//	            s1Map.put(s1Char, s1Map.get(s1Char) + 1);
//	        else
//	            s1Map.put(s1Char, 1);
//	        
//	        if(s2Map.containsKey(s2Char))
//	            s2Map.put(s2Char, s2Map.get(s2Char) + 1);
//	        else
//	            s2Map.put(s2Char, 1);
//	    }
//
//	    return s1Map.equals(s2Map);
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		
		for(int i = 0; i < s1.length(); i++) {
			letters[s1.charAt(i)]++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			letters[s2.charAt(i)]--;
			if(letters[s2.charAt(i)] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
