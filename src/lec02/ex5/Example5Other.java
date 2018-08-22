package lec02.ex5;

public class Example5Other {

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
		
		// If we want to use something from a
		// different package, we have to use 
		// a fully qualified name:
		// package.class.method
		
		// Recall that checkIfPositive and realCompare
		// are defined in the package lec02.ex3 in the
		// class Example3
		
		if (lec02.ex3.Example3.checkIfPositive(a)) {
			double d1 = 0.3;
			double d2 = 0.1 + 0.1 + 0.1;
			if (lec02.ex3.Example3.realCompare(d1, d2)) {
				System.out.println("Here");
			}
		}
	}
}
