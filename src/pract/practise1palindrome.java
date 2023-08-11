package pract;

public class practise1palindrome {
	
//	these are 2 pointer problems

	public static void main(String[] args) {
		String str1[]= {"m","a","l","a","y","a","l","a","m"};

		for (int i = 0 , j=str1.length-1; j>i; i++,j--) 
		{
			if (str1[i] != str1[j]) 
			{
				System.out.println("is not a palindrome");
				return;
			}
		}
		System.out.println("is a palindrome");

	}

}
