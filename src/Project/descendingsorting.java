package Project;

import java.util.Arrays;

public class descendingsorting {

	public static void main(String[] args) {
		int[] arr = {21,33,4,3,2,44,2};
		for(int i =0; i < arr.length; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
