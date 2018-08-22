package lec02.ex5;

public class Example5 {

	public static void main(String[] args) {
	
		int a = 3;
		int b = -4;
		int c = 0;
		
		// Because max and min are methods 
		// defined in this class, we can just
		// call them with max() and min()
		
		System.out.println(max(a, b, c));
		System.out.println(min(a, b, c));
		System.out.println(max(a+b+c, a-b-c, a*b*c));
		System.out.println(min(a+b+c, a-b-c, a*b*c));
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
		// Anything here is unreachable
		// and Java knows it!
		// System.out.println("Unreachable");
	}
	
	public static int min(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}
	
}
