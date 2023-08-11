package pract;

class Fib_4 {
	  // Define a method to print the first Fibonacci number that is also a multiple of 4, in a given range
	  public static void fib_4(int low, int high) {
	    // Initialize the first two Fibonacci numbers
	    int a = 0;
	    int b = 1;
	    // Loop until the Fibonacci number is less than or equal to the higher bound
	    for (int i = 0; a <= high; i++) {
	      // If the Fibonacci number is greater than or equal to the lower bound
	      if (a >= low) {
	        // If the Fibonacci number is also a multiple of 4
	        if (a % 4 == 0) {
	          // Print the Fibonacci number and exit the method
	          System.out.println(a);
	          return;
	        }
	      }
	      // Update the next Fibonacci number by adding the previous two
	      int c = a + b;
	      a = b;
	      b = c;
	    }
	    // If no such Fibonacci number is found, print 0
	    System.out.println(0);
	  }
}

	  // Test