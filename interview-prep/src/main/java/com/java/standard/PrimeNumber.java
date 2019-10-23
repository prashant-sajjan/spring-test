package com.java.standard;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2 ; i <=num/2; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
