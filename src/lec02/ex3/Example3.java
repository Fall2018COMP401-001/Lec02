package lec02.ex3;

public class Example3 {

	public static void main(String[] args) {
		int foo = 100;
		int bar = 200;

		if (foo < bar) {
			int a = 5;
			System.out.println("Here a = " + a);
		} else {
			String a = "A string, not a number.";
			System.out.println("But here a is: " + a);			
		}

		// Don't test a boolean expression
		// for being true in conditional test. 
		// Just let the expression speak for itself

		if (checkIfPositive(5) == true) {
			System.out.println("Not like this");
		}
		
		if (checkIfPositive(5)) {
			System.out.println("This is better");
		}

		// The ! operator negates a boolean
		// So if you want to test for false, just
		// negate the expression

		if (!checkIfPositive(-5)) {
			System.out.println("Here if negative");
		}

		// switch can be prettier than a 
		// a complex series of if statements.
		char c = 'y';

		switch (c) {
		case 'a': 
		case 'e': 
		case 'i':
		case 'o': 
		case 'u': 
			System.out.println("Vowel");
			break;

		case 'y':
			System.out.println("Sometimes a vowel");
			break;

		default: 
			System.out.println("Consonant");
		}

		// Compare above with this:
		if ((c == 'a') ||
			(c == 'e') ||
			(c == 'i') ||
			(c == 'o') ||
			(c == 'u')) {
			System.out.println("Vowel");
		} else if (c == 'y') {
			System.out.println("Sometimes a vowel");
		} else {
			System.out.println("Consonant");
		}

		// Be careful when testing two real values
		// against each other.
		
		double a = 0.3;
		double b = 0.1 + 0.1 + 0.1;
		if (a == b) {
			System.out.println("This is what I expect");
		} else {
			System.out.println("This is what I get");
		}
		
		// Use the Math.abs() function and some
		// sort of precision bound instead.
		
		if (Math.abs(a-b) < 0.00001) {
			System.out.println("This works better");
		}
		
		// If you do it a lot, make a function
		// for it.
		if (realCompare(a,b)) {
			System.out.println("This works better");
		}
	}

	public static boolean checkIfPositive(int x) {
		if (x > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean realCompare(double a,double b) {
		return Math.abs(a-b) < 0.00001;
	}
}
