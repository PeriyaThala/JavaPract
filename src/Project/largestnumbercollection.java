package Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestnumbercollection {

	public static void main(String[] args) {
		Integer[] array = {10, 12, 23, 55, 22};
		List<Integer> list=Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

}
