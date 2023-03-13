package B04;

import java.util.Arrays;

public class Ex03_LengthElement {

	public static void main(String[] args) {
		String[] arrString = { "Zend 2", "PHP", "Java", "Javascript" };
		int length = arrString.length;
		int[] arrLength = new int[length];
		for (int i = 0; i < length; i++) {
			arrLength[i] = arrString[i].length();
		}
		System.out.println(Arrays.toString(arrLength));
	}
}
