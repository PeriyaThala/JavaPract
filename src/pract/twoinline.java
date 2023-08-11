package pract;

import java.util.Arrays;
import java.util.HashMap;

public class twoinline {

	public static void main(String[] args) {
		HashMap<Character, Integer> cache = new HashMap<Character, Integer>();
		
		String input1 = "hello";
		String input2 = "lleohhel";
		for(int i=0;i<input1.length();++i) {
			if(cache.containsKey(input1.charAt(i))){
				cache.put(input1.charAt(i), cache.get(input1.charAt(i))+1);
			} else {
				cache.put(input1.charAt(i), 1);
			}
		}
		
		for(int i=0;i<input2.length();++i) {
			if(cache.containsKey(input2.charAt(i))){
				cache.put(input2.charAt(i), cache.get(input2.charAt(i))-1);
			} else {
				System.out.println(input2+" is not an anagram of "+input1);
				return;
			}
		}
		
		for(Integer value: cache.values()) {
			if(value != 0) {
				System.out.println(input2+" is not an anagram of "+input1);
				return;
			}
		}
		
		System.out.println(input2+" is an anagram of "+input1);
	}

}
