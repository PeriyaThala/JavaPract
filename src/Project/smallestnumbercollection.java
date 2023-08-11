package Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class smallestnumbercollection {

	public static void main(String[] args) {
		Integer[] array = {9,376,0,7,1};
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list.get(0));
	}

}
