package Project;

public class primenumber {

	public static void main(String[] args) {
		// find whether the number is prime or not
		int num = 4;
		int count = 0;
		for (int i =2; i<num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("not a prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
