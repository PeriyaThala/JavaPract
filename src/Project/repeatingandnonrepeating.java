package Project;

public class repeatingandnonrepeating {

	public static void main(String[] args) {
		String str = "vasu vanshika";
		char[] ch = str.toCharArray();
		for(int i = 0; i<str.length(); i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {   // to find the first non repeating character, also for finding the first repeating character use count!=1 in if loop
				System.out.println(ch[i]);
				break;
			}
		}

	}

}
