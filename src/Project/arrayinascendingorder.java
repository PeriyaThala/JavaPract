package Project;

import java.util.Arrays;

public class arrayinascendingorder {

	public static void main(String[] args) {
		
		int[] array = { 1,5,3,2,44,55,44,66,87,9};
		
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
