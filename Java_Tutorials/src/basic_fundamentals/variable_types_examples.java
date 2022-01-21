package basic_fundamentals;

import java.lang.*;

public class variable_types_examples {

	public static void main(String[] args) {
		/*
		 * The main method:
		 * PUBLIC is the MODIFIER, in this case it is public so anyone can access it
		 * 
		 * STATIC is a method that can be run without creating an instance of the class containing the main method
		 * 
		 * void is the return type; since its void, it doesn't return any value
		 * 
		 * main is the method name
		*/
		
		// final -> a constant 
		final double PI = 3.14;
		
		// casting variables
		// converts from double to int
		double dubs = 5.0;
		int num = (int) dubs;
		
		short ourShort = 4;
		System.out.println(ourShort);
		
		byte ourByte = 2;
		System.out.println(ourByte);
		
		int ourInt = 1;
		System.out.println(ourInt);
		
		long ourLong = 132;
		System.out.println(ourLong);
		
		float ourFloat = 1.0f;
		System.out.println(ourFloat);
		
		char ourChar = 'a';
		System.out.println(ourChar);
		
		boolean ourBoolean = true;
		System.out.println(ourBoolean);
		
		// Explicitly (best practice)
		int aNum = 2131;
		float newNum = (float) aNum;
		System.out.println(newNum);
		
		// Chars and Numbers
		char newChar = '5';
		int charInt = newChar;
		
		System.out.println(newChar); // prints 5
		System.out.println(charInt); // prints 53
		
		// increment and decrement
		int A = 0;
		A++;	// same as saying A = A+1
		System.out.println(A);
		
		int b = 10;
		b+=5;	// same as saying b = b+5
		System.out.println(b);
 		
 		// Math Expressions
		System.out.println(Math.pow(2, 3));		// 2^3 = 8  ** Math.pow(base number, exponent)
		

	}

}
