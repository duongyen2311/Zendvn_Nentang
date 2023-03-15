package B05;

import java.util.Arrays;

public class Ex03_RemoveSpace {

	public static void main(String[] args) {
		String str = "  j a Va ";

		// Xoa ky tu khoang trang
		str = str.replaceAll("\\s", "");
		System.out.println(str);

		// Chuyen ky tu hoa <-> thuong
		int length = str.length();
		char[] arrStr = new char[length];
		String str2 = "";
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = str.charAt(i);
			if (Character.isUpperCase(arrStr[i]) == true) {
				str2 += (arrStr[i] + "").toLowerCase();
			} else {
				str2 += (arrStr[i] + "").toUpperCase();
			}
		}
		System.out.println(str2);
	}

}
