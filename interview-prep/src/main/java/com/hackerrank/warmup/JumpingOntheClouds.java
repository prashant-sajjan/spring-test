package com.hackerrank.warmup;

public class JumpingOntheClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jumpingOnClouds(new int[] {0, 0, 0, 0, 1 ,0}));
	}

	static int jumpingOnClouds(int[] c) {

		 int count = 0;
	        int i = 0;
	        while(i < c.length-1){
	            if(i+2 < c.length && c[i + 2] == 0){
	                i = i + 2;
	                count++;
	            }
	            else{
	                i++;
	                count++;
	            }
	        }
	        return count;
    }

}
