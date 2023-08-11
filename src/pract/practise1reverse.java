package pract;

public class practise1reverse {

	public static void main(String[] args) 
	{
		String str = "vav";
		
		for(int i = 0, j = str.length()-1; j>i;i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				System.out.println("not");
				return;
			}
		}
		System.out.println("yes");
	}
}

		