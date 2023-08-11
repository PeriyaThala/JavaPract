package Project;

public class fibonici {

	public static void main(String[] args) {
		
		int num = 5;
		int num1=0;
		int num2=1;
		int sum;
		System.out.print(num1 + " "+ num2);
		for (int i = 2; i<=num; i++) {
			sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(" "+sum);
		}
	}
}

