package B07;

public class Ex01_PassBasic {
	public static void main(String[] args) {
		String str = "luutruonghailan";
		String key = "3633";
		String[] keyString = key.split("");
		int keyLength = keyString.length;
		int[] keyNumber = new int[keyLength];
		int startIndex = 0;
		String result = "";

		for (int i = 0; i < keyLength; i++) {
			keyNumber[i] = Integer.parseInt(keyString[i]);
			String word = str.substring(startIndex, startIndex + keyNumber[i]);
			startIndex += keyNumber[i];
			String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
			result += cap + " ";
		}
		System.out.println(result.trim());

	}

}
