package lec02.ex5;

import lec02.ex3.Example3;

public class Example5OtherRevisited {

	public static void main(String[] args) {
		
		int a = 5;
		int b = -2;
		int c = -10;
		
		// Because max and min are methods 
		// defined in a different class 
		// in this same package, we need
		// to call them as
		// Example5.min() and Example5.max()
		
		System.out.println(Example5.max(a, b, c));
		System.out.println(Example5.min(a, b, c));
		System.out.println(Example5.max(a+b+c, a-b-c, a*b*c));
		System.out.println(Example5.min(a+b+c, a-b-c, a*b*c));
		
		// We can use methods from Example3 without having to
		// use a fully qualified name that includes
		// its package because of the import statement
		// at the beginning of this file.
		
		if (Example3.checkIfPositive(a)) {
			double d1 = 0.3;
			double d2 = 0.1 + 0.1 + 0.1;
			if (Example3.realCompare(d1, d2)) {
				System.out.println("Here");
			}
		}
		
		// Math is a class defined in the java.lang
		// package. All of the class names in java.lang
		// are automatically imported.

		System.out.println(Math.cos(Math.toRadians(45)));
		System.out.println(1.0/Math.sqrt(2.0));
	}
}
