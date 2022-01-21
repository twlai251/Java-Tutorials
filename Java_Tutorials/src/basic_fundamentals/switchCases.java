package basic_fundamentals;

import java.util.Scanner;

public class switchCases {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		try {
			// prompt user for input
			String prompt = "Please enter a something: ";
			System.out.println(prompt);
			
			// read from console
			int testCase = userInput.nextInt();
		

			
		switch (testCase) {
		case 1:
			System.out.println("1. Hi! How are you?");
			break;
			
		case 2:
			System.out.println("2. Hello World");
			break;
			
		case 3:
			System.out.println("3. See you later!");
			break;

		default:
			System.out.println("User entered an integer not in range of 1 - 3.");
			break;
		}
		
		// output our user input
		// System.out.println(inInt);
		
		// close the scanner
		userInput.close();
		} catch (Exception e) {
			System.out.println("User didn't enter an integer!");
		}

	}

}
