package basic_fundamentals;

public class loopsExamples {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 50;
		
		int a = 20;
		int b = 100;
		
		// Using AND & OR operators
		System.out.println("Using AND & OR operators");
		if((a == b) && (a < 50)) {
			System.out.println("a is equal to b AND a is greater than 50");
		}
		else if((a > 100) || (b >= 100)) {
			System.out.println("a is greater than 100 OR b is greater than or equal to 100");
		}
		else {
			System.out.println("Neither is true.");
		}
		
		
		// While Loops
		System.out.println("");
		System.out.println("WHILE LOOPS");
		while(x != 10) {
			System.out.println("x : " + x);
			x++;
		}
		
		// do-while loops will always run once whether it is true or not
		System.out.println("");
		System.out.println("DO-WHILE LOOPS");
		do {
			System.out.println("y : " + y);
		} while (y != 50);
		
		
		// For Loops
		System.out.println("");
		System.out.println("FOR LOOPS");
		for(int i = 0; i < 5; i++) {
			System.out.println("i is " + i);
		}
		
		// Nested For Loops
		System.out.println("");
		System.out.println("FOR LOOPS");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("i is : " + i + " while j is : " + j);
				if (j == 4) {
					System.out.println("");
				}
			}
			
		}
		
		
//		END OF MAIN METHOD
	}

}
