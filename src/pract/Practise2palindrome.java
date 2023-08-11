package pract;

import java.io.IOException;
import java.util.Scanner;

public class Practise2palindrome {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = a + b;
		int t = 0;
		if(input1 % 4==0) {
			System.out.println(0);
			return;
		}
		while (c <= input2) {
			if (c % 4 == 0 && c >= input1) {
				break;
			}
			t = c;
			c = b + c;
			b = t;
		}
		if (c > input2) {
			System.out.println(0);
		} else {
			System.out.println(c);
		}
	}
}

//Write a program to print the 1st fibonaci numbers that is also a multiple of 4, in a given range. 
//
//Example 1: Given two number 3 and 150, the first fibonaci number that is also a multiple of 4 is 8
//Given input
//3
//150
//Expected output
//8
//
//NOTE: If there is no number matching the condition, then print 0
//
//Example 1: Given two number 50 and 2600, the first fibonaci number that is also a multiple of 4 is 144
//Given input
//50
//2600
//Expected output
//144
