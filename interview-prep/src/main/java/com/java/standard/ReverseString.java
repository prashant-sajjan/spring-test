package com.java.standard;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void str_rev(char[] str, int start, int end) {
	    if (str == null || str.length < 2) {
	      return;
	    }

	    while (start < end) {

	      char temp = str[start];
	      str[start] = str[end];
	      str[end] = temp;

	      start++;
	      end--;
	    }  
	  }
	
	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
}
