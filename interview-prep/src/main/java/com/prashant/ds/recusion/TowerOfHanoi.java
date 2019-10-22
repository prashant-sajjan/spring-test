package com.prashant.ds.recusion;

public class TowerOfHanoi {
	private static int numOfMoves = 0;
	public void move(int discNum, char from, char to, char inter) {
		if(discNum == 1) {
			System.out.println("Moving disc 1 from " + from + " to " + to);
			numOfMoves++;
		} else {
			move(discNum - 1, from, inter, to);
			System.out.println("Moving disc " + discNum + " from " + from + " to " + to);
			numOfMoves++;
			move(discNum - 1, inter, to, from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(3, 'A', 'C', 'B');
		System.out.println("Number of moves: " + numOfMoves);
	}
}
