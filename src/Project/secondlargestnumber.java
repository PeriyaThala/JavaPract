package Project;

public class secondlargestnumber {

	public static void main(String[] args) {
		int firstmax = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int array[] = {1,23,43,44,55,55,44, 145, 123, 145, 122};
		
		for(int i =0; i<array.length;i++) {
			if(array[i]>firstmax) {
				secondmax=firstmax;
				firstmax = array[i];
			} else if(array[i] > secondmax &&  array[i] != firstmax) {
				secondmax = array[i];
			}
		}
		
		System.out.println(firstmax+" "+secondmax);

	}

}
