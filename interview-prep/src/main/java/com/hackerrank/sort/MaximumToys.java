package com.hackerrank.sort;

import java.util.Arrays;

public class MaximumToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int totalToys = 0;
        for(int i = 0; i < prices.length; i++)
        {
            k -= prices[i];
            if(k > 0) totalToys++;
            if(k <= 0) break;
        }
       return totalToys; 
    }
	
	/*public int compare(Player a, Player b) {
        if (a.score < b.score) {
        return 1;
        } else if (a.score > b.score) {
        return -1;
        } else {
        return a.name.compareTo(b.name);
        }
    }*/
}
