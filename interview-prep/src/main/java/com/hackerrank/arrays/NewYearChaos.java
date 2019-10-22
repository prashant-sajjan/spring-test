package com.hackerrank.arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumBribes(new int[] {2 ,1 ,5 ,4 ,3});
	}

	static void minimumBribes(int[] q) {
	    int bribe = 0;
	    boolean chaotic = false;
	    int n = q.length;
	    for(int i = 0; i < n; i++)
	    {
	        if(q[i]-(i+1) > 2)
	        {               
	            chaotic = true;
	            break;     
	        }
	        for (int j = Math.max(0, q[i]-1-1); j < i; j++) {
	            if (q[j] > q[i])  {
	            	bribe++;
	            }
	        }
	    }
	    if(chaotic)
	        System.out.println("Too chaotic");
	    else
	    	System.out.println(bribe);
	}
}
