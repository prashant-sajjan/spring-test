package com.hackerrank.arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]mat = {{1, 1 , 1 ,0 ,0 , 0}, 
                {0 , 1, 0, 0, 0, 0}, 
                {1, 1, 1, 0, 0, 0}, 
                {0, 0, 2, 4, 4, 0}, 
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}; 
		
		int res = findMaxSum(mat); 
		if (res == -1) 
			System.out.println("Not possible"); 
		else
			System.out.println("Maximum sum of hour glass = "
                         + res); 
	}
	
	static int findMaxSum(int [][] arr) 
	{ 
		int Row = 6; 
		int Col = 6; 
	    if (Row < 4 || Col < 4) 
	        return -1; 
	  
	    // Here loop runs (R-2)*(C-2)  
	    // times considering different 
	    // top left cells of hour glasses. 
	    int max_sum = Integer.MIN_VALUE; 
	    for (int i = 0; i < Row - 2; i++) 
	    { 
	        for (int j = 0; j < Col - 2; j++) 
	        { 
	            // Considering mat[i][j] as top  
	            // left cell of hour glass. 
	            int sum = (arr[i][j] + arr[i][j + 1] +  
	            		arr[i][j + 2]) + (arr[i + 1][j + 1]) +  
	                       (arr[i + 2][j] + arr[i + 2][j + 1] +  
	                    		   arr[i + 2][j + 2]); 
	  
	            // If previous sum is less then  
	            // current sum then update 
	            // new sum in max_sum 
	            max_sum = Math.max(max_sum, sum); 
	        } 
	    } 
	    return max_sum; 
	} 

}
