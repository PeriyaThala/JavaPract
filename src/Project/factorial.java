package Project;

public class factorial {

	public static void main(String[] args) {
		// fact of a given number
		int number = 4;
		int fact = 1;
		for(int i = 1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
