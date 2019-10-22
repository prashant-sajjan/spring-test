package com.leetcode.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoko {

	public static void main(String[] args) {
		int val = '9' - '1';
		System.out.println(val);
	}
	
	@SuppressWarnings("unchecked")
	static boolean isValidSudoko(char[][] board) {
		Map<Integer, Integer> [] rows = new HashMap[9];
		Map<Integer, Integer> [] columns = new HashMap[9];
		Map<Integer, Integer> [] boxes = new HashMap[9];
		
		for (int i = 0; i < 9; i++) {
			rows[i] = new HashMap<>();
			columns[i] = new HashMap<>();
			boxes[i] = new HashMap<>();
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				char num = board[i][j];
				if(num != '.') {
					int n = (int)num;
					int boxIndex = 3 * (i/3) + j/3;
					
					rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
					columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
					boxes[boxIndex].put(n, boxes[boxIndex].getOrDefault(n, 0) + 1);
					
					if(rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[boxIndex].get(n) > 1) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	static boolean isValidSudokoOneMS(char[][] board) {
		 boolean[][] col = new boolean[9][9], box = new boolean[9][9];
	        
	        for (int x = 0; x < 9; x++) {
	            boolean[] row = new boolean[9];
	            for (int y = 0; y < 9; y++) {
	                if (board[x][y] == '.') continue;
	                int val = board[x][y] - '1';
	                if (row[val] || col[y][val] || box[x/3*3 + y/3][val]) return false;
	                row[val] = col[y][val] = box[x/3*3 + y/3][val] = true;
	            }
	        }
	        return true;
	 }
}
