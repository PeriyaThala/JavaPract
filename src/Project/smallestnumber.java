package Project;

public class smallestnumber {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int array[] = {1,4,54,6,0,65};
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
