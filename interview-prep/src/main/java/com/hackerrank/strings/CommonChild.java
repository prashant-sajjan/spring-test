package com.hackerrank.strings;

public class CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int commonChild(String s1, String s2) {
		int length1 = s1.length();
	    int length2 = s2.length();
	    int[][] commonLengths = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    commonLengths[i][j] = commonLengths[i - 1][j - 1] + 1;
                } else {
                    commonLengths[i][j] = Math.max(commonLengths[i - 1][j], commonLengths[i][j - 1]);
                }
            }
        }
	    return commonLengths[length1][length2];

	}

}
