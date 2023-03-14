package B05;

public class Ex02_UpdateString {

	public static void main(String[] args) {
		StringBuilder strBuilderObj = new StringBuilder("ab239JA2VAc1de");

		// Xoa ky tu thu hai va ky tu ke cuoi
		strBuilderObj.deleteCharAt(1);
		strBuilderObj.deleteCharAt(strBuilderObj.length() - 2);
		System.out.println(strBuilderObj);

		// Xoa ky tu so trong chuoi
		String str = strBuilderObj.toString();
		str = str.replaceAll("\\d", "");
		System.out.println(str);

		// Them gia tri Zendvn.com vao giua chuoi
		strBuilderObj.replace(0, strBuilderObj.length(), str);
		strBuilderObj.insert(strBuilderObj.length() / 2 + 1, "Zendvn.com");
		System.out.println(strBuilderObj);

	}

}
