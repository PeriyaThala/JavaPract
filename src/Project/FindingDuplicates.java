package Project;

import java.util.HashMap;

public class FindingDuplicates {

	public static void main(String[] args) {
		String s1 = "vasuv";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		for (Character d : hm.keySet()) {
			if (hm.get(d) > 1) {
				System.out.println(d);		
			}
		}

//		char[] ch = s1.toCharArray();
//		for (int i = 0; i < s1.length(); i++) {
//			for (int j = i + 1; j < s1.length(); j++) {
//				if (ch[i] == ch[j]) { //-------------------- to delete use s1.deleteAt(i); i=0;j=0;s1.length() = s1.length() -1;
//					System.out.println("the duplicates are :" + ch[j]);
//				}
//			}
//		}

	}
}
