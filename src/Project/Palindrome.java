package Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		
		try {
			String input=reader.readLine();
			
			for(int i=0,j=input.length()-1;i<input.length() && j>i;++i,--j) {
				if(input.charAt(i) != input.charAt(j)) {
					System.out.println(input+" is not a palidrome");
					return;
				}
			}

			System.out.println(input+" is a palidrome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
