package basic_fundamentals;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// create scanner object
		Scanner userInput = new Scanner(System.in);
		
		// prompt user for input
		String prompt = "Please enter a sentence: ";
		System.out.println(prompt);
		
		// read from console
		
		// BECARFUL OF WHAT INPUT VARIABLE YOU ARE USING OR IT WILL CAUSE AN ERROR
		
		// String
		String storage = userInput.nextLine();
		
//		// Int
//		int inInt = userInput.nextInt();
//		
//		// Long
//		long inLong = userInput.nextLong();
//		
//		//Short
//		short inShort = userInput.nextShort();
//		
//		// Boolean
//		boolean bool = userInput.nextBoolean();
//		
//		// Byte
//		byte inByte = userInput.nextByte();
//		
//		// Double
//		double inDouble = userInput.nextDouble();
//		
//		// Float
//		float inFloat = userInput.nextFloat();	
		
		// output our user input
		System.out.println(storage);
		
		// close the scanner
		userInput.close();
		
			
		
		/* LOOPS, NEST LOOPS AND CONDITIONS */
		if(storage == "Hello" ) {
			System.out.println("User input for boolean is: " + storage);
		}
		else {
			if(storage != "Hello") {
				System.out.println("User input for string is not Hello but : " + storage);
			}
		}
		
		

	}

}
