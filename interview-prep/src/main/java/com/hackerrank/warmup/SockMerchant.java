package com.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    	
    	System.out.println(sockMerchant(9, new int [] {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5}));
    }
    
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socksMap = new HashMap<>();
        for(int socks : ar) {
            if(socksMap.containsKey(socks)) {
                socksMap.put(socks, socksMap.get(socks) + 1);
            } else {
                socksMap.put(socks, 1);
            }
        }

        int sockPairs = 0;
        for(Entry<Integer, Integer> entry: socksMap.entrySet()) {
        	int val = entry.getValue();
            if(val >= 2) {
            	int pair = val%2==0 ? val : val - 1;
                sockPairs = sockPairs + pair/2;
            }
        }
        return sockPairs;
    }
    
    static int sockMerchantNew(int n, int[] ar) {
       Map<Integer, Integer> inventory = new HashMap<>();
       int matchingPairs = 0;
       for(int i = 0; i < n; i++) {
    	   
    	   int color = ar[i];
    	   
    	   if(inventory.containsKey(color) && inventory.get(color).equals(new Integer(1))) {
    		   inventory.put(color, 0);
    		   matchingPairs++;
    		   continue;
    	   }
    	   
    	   inventory.put(color, 1); 
       }
        return matchingPairs;
    }
}
