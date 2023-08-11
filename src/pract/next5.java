package pract;

import java.util.Scanner;

public class next5 {

	public static boolean isFib(int num) {
		int a = 0;
		int b = 1;
		int c = a + b;
		int t = 0;
		if (num == 1) {
			return true;
		}
		while (c <= num) {
			if (c == num) {
				return true;
			}
			t = c;
			c = b + c;
			b = t;
		}
		return false;
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		if ((isPrime(input1)) && !(isFib(input1))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
//
//Write a program that checks if a given number is prime but does not belong to the fibonaci series. The program should return 1 if the numer is prime and does not belong to the fibonaic series or 0 otherwise
//
//Example 1: The number 5 is both prime and belongs to the fibonaci series. Hence you should return 0
//Given input
//5
//Output should be
//0
//
//Example 2:  The number 7 is prime but does belongs to the fibonaci series. Hence you should return 1
//Given input
//7
//Output should be 
//1
