package com.hackerrank.strings;

public class SpecialStringAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substrCount(5,"asasd"));
	}
	static long substrCount(int n, String s) {
		 long ans = 0;

        for (int i = 0; i < n; i++) {
            ans++;
            char previousChar = s.charAt(i);
            int charsLeftCount = 1;
            int charsRightCount = 0;
            boolean reachedMiddle = false;

            for (int j = i + 1; j < n; j++) {
                char ch = s.charAt(j);
                if (!reachedMiddle && ch != previousChar) {
                    reachedMiddle = true;
                } else if (reachedMiddle && (ch != previousChar || j == n - 1)) {
                    if (j == n - 1 && ch == previousChar) {
                        charsRightCount++;
                    }

                    if (charsLeftCount == charsRightCount) {
                        ans++;
                    }

                    break;
                } else if (!reachedMiddle && ch == previousChar) {
                    charsLeftCount++;
                    if (charsLeftCount >= 2) {
                        ans++;
                    }
                } else if (reachedMiddle && ch == previousChar) {
                    charsRightCount++;
                    if (charsLeftCount == charsRightCount) {
                        ans++;
                        break;
                    }
                }
            }
        }

	    return ans;
	}
}
