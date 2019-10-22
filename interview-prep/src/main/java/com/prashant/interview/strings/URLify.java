package com.prashant.interview.strings;

public class URLify {
	
	public static void main(String[] args) {
		System.out.println(replaceSpaces("Mr John Smith       ".toCharArray(), 13));
	}
	
	private static String replaceSpaces(char[] str, int trueLength) {
		int numberOfSpaces = countOffChar(str, 0, trueLength, ' ');
		int newIndex = trueLength - 1 + numberOfSpaces * 2;
		
		if(newIndex + 1 < str.length) {
			str[newIndex + 1] = '\0';
		}
		
		for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -=1) {
			if(str[oldIndex] == ' ') {
				str[newIndex] = '0';
				str[newIndex - 1] = '2';
				str[newIndex - 2] = '%';
				newIndex -=3;
			} else {
				str[newIndex] = str[oldIndex];
				newIndex -= 1;
			}
		}
		
		return new String(str);
	}
	
	private static int countOffChar(char[] str, int start, int end, int target) {
		int count = 0;
		
		for(int i = start; i < end; i++) {
			if(str[i] == target) {
				count++;
			}
		}
		
		return count;
	}
}
