package Project;

import java.util.HashMap;

public class frequencyoccurances {

	public static void main(String[] args) {
		String Str = "Welc omew";
		HashMap<Character, Integer> hm = new HashMap<>();
		Str = Str.toLowerCase();
		for(int i =0; i<Str.length(); i++) {
			char ch = Str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else 
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}

}
