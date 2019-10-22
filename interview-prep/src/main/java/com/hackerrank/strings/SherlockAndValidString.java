package com.hackerrank.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("abcdefghhgfedecba"));
	}
	
	static String isValid(String s) {

		Map<Character, Integer> frequencies = new HashMap<>();
        
        for(char letter : s.toCharArray())
        {
            if(frequencies.containsKey(letter))
                frequencies.put(letter, frequencies.get(letter) + 1);
            else
                frequencies.put(letter, 1);
        }
        
        Set<Integer> st = new HashSet<>();
        for(int freq : frequencies.values())
        {
            st.add(freq);
        }
        
        if(st.size() > 2)//More than 2 frequencies
           return "NO";
        else if(st.size() == 1)
        	return "YES";
        else//2 different frequencies
        {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for(int n : st)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }
            
            for(int freq : frequencies.values())
            {
                if(freq == f1) f1Count++;
                if(freq == f2) f2Count++;
            }
            
            
            
            if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
            	return "YES";
            else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
            	return "YES";
            else
            	return "NO";
        }
    }

}
