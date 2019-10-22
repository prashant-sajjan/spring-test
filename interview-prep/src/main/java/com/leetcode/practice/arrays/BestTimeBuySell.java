package com.leetcode.practice.arrays;

public class BestTimeBuySell {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
             if(prices[i] - prices[i-1] > 0) {
                maxProfit+= prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
