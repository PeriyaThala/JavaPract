package Project;

public class largestnumber {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int array[] = {4,3,2,6,7,18,9};
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
		
		
	}

}
