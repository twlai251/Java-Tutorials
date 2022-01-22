/*
 *	Create a method that follows the following rules that:
 *	The method should print out a list of length n, with each index i following these rules
 *
 *	1. If a number n is divible by 3. print "Fizz"
 *	2. If a number n is divible by 5. print "Buzz"
 *	3. If a number n is divible by 3 and 5. print "Fizzbuzz"
 *
 */

package exercises;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String prompt = "Please enter a number: ";
		System.out.print(prompt);
		
		int n = userInput.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizzbuzz");
			}
			else if((i % 3 == 0)) {
				System.out.println("Fizz");
			}
			
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		System.out.println("");
		System.out.println("BONUS : ONLY NON-PRIME NUMBERS");
		for(int i = 1; i <= n; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizzbuzz");
			}
			else if((i % 3 == 0)) {
				System.out.println("Fizz : " + i);
			}
			
			else if(i % 5 == 0) {
				System.out.println("Buzz : " + i);
			}
			else {
				int counter = 0;
				for(int j = n; j >= i; j--) {
					if((i % j == 0)) {
						counter++;
					}
				}
				if(counter == 2) {
					System.out.println("This is a prime number : " + i);
				}
			}
			
		}
		
		// END OF MAIN METHOD
	}

}
