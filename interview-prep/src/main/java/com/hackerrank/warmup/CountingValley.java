package com.hackerrank.warmup;

public class CountingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int countingValleys(int n, String s) {
		int altitude = 0;
		int num_valley = 0;
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'U') {
				if(altitude == -1) {
					num_valley++;
				}
				altitude++;
			}
			if(s.charAt(i) == 'D') {
				altitude--;
			}
			
		}
		return num_valley;
    }

}
