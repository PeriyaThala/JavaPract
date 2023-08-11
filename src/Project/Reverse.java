package Project;

public class Reverse {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("PoPo");

		for (int i = 0, j = str1.length() - 1; j > i; i++, j--) {
			char str2 = str1.charAt(i);
			str1.setCharAt(i, str1.charAt(j));
			str1.setCharAt(j, str2);
		}
		System.out.println(str1);

	}

}
