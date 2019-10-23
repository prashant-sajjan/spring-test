package com.java.standard;

public class SubArray {

	  static boolean isSubArray(int A[], int B[], int n, int m) 
	    { 
	        // Two pointers to traverse the arrays 
	        int i = 0, j = 0; 
	  
	        // Traverse both arrays simultaneously 
	        while (i < n && j < m) { 
	  
	            // If element matches 
	            // increment both pointers 
	            if (A[i] == B[j]) { 
	                i++; 
	                j++; 
	  
	                // If array B is completely 
	                // traversed 
	                if (j == m) 
	                    return true; 
	            } 
	            // If not, 
	            // increment i and reset j 
	            else { 
	                i++; 
	                j = 0; 
	            } 
	        } 
	  
	        return false; 
	    } 
	  
	    // Driver Code 
	  
	    public static void main(String[] args) 
	    { 
	        int n = 7; 
	        int m = 4; 
	  
	        int A[] = { 2, 3, 0, 5, 1, 1, 2 }; 
	        int B[] = { 3, 0, 5, 1 }; 
	  
	        if (isSubArray(A, B, n, m)) 
	            System.out.println("YES\n"); 
	        else
	            System.out.println("NO\n"); 
	    } 
}
