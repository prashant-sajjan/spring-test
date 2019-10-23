package com.java.standard;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int factorial(int number){      
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
	
	public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
     
        return result;
    }

}
