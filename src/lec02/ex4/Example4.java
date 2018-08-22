package lec02.ex4;

public class Example4 {

	public static void main(String[] args) {
		
		// Any for loop can be written
		// as an equivalent while loop
		
		int sum = 0;
		
		for (int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// And it's equivalent while version
		// using the variable j instead of i:
		
		sum = 0;
		int j=1;
		while (j<11) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
		// Notice that in the above, variable i
		// in the for loop is only in scope for the
		// body of the for loop because it was
		// declared within the for statement. It does
		// not exist after the for loop is done which
		// makes this illegal:
		
		// System.out.println("The value of i is: " + i);
		
		// In contrast, the variable j used by the
		// while loop is declared outside of the while
		// loop within the body of the method so it still
		// exists even after the while loop is done which
		// makes this a legal statement:
		
		System.out.println("The value of j is : " + j);
		
		// Break will terminate a loop.
		// Continue will skip rest of loop body
		// and go to next iteration.
		
		int num_tries;
		double dsum = 0.0;
		for (num_tries=0; num_tries < 10; num_tries++) {
			double r = Math.random();
			if ((r > 0.9) || (r < 0.1)) {
				continue;
			}
			dsum += r;
			if (dsum > 5.0) {
				break;
			}
		}
		System.out.println("Collected a sum of " + dsum +
				           " in " + num_tries + " tries");
		
	}

}
