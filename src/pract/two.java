package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class two {
	
	public static boolean isSpl(char ch) {
		
		int ascii = (int)ch;
		int mid1 = ascii-65;
		int mid2 = ascii-97;
		if((mid1>= 0 && mid1<=25) ||(mid2>= 0 && mid2<=25)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
			String input=reader.readLine();
			
			char[] ch = input.toCharArray();
			for(int i=0; i<ch.length; i++) {
				if(isSpl(ch[i])) {
					ch[i]='#';
				}
			}
			String str = new String(ch);
			System.out.println(ch);
	}

}

/*
 * Given an array of random characters, integers and symbols, WAP to print the
 * original array but instead of the special characters and numbers print the
 * symbol #.
 * 
 * Example 1: given the below input, the output will have the special characters
 * and numbers replaced by a # Given Input GSD#13xxU343%^DGF1@@
 * 
 * Expected output GSD###xxU#####DGF###
 * 
 * Example 2: given the below input, the output will have the special characters
 * and numbers replaced by a # Given Input 11@@33S*DFS44_+}bb#555
 * 
 * Expected output ######S#DFS#####bb####
 */