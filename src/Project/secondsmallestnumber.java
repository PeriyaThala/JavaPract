package Project;

public class secondsmallestnumber {

	public static void main(String[] args) {
		int firstmin = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		int array[] = {2,4,1,66,4,33,66,11};
		for(int i=0;i<array.length;i++) {
			if(array[i]<firstmin) {
				secondmin = firstmin;
				firstmin = array[i];
			} else if (array[i] < secondmin && array[i] != firstmin) {
				secondmin = array[i];
			}
		}
		System.out.println(firstmin+ " "+ secondmin);

	}

}
