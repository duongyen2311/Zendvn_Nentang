package B07;

public class Ex02_PassAdv {
	public static void main(String[] args) {
		String input = "2c+)1o!@(*&!y@&chi&^c!@#o3co$23%%^nd$#$!uo5ng";
		String[] element = input.split("");
		int startIndex = 0;
		String result = "";
		String key = "";
		int inputLength = element.length;
		String str = "";
		// Tach lay chuoi
		for (int i = 0; i < inputLength; i++) {
			if (element[i].matches("\\w")) {
				// Tach chuoi so
				if (element[i].matches("\\d")) {
					key += element[i];
				}
				// Tach chuoi ky tu
				if (element[i].matches("[a-zA-Z]")) {
					str += element[i];
				}
			}
		}

		// Viet hoa va them space
		int keyLength = key.length();
		String[] keyString = key.split("");
		int[] keyNumber = new int[keyLength];

		for (int i = 0; i < keyLength; i++) {
			keyNumber[i] = Integer.parseInt(keyString[i]);
			String word = str.substring(startIndex, startIndex + keyNumber[i]);
			startIndex += keyNumber[i];
			String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
			result += cap + " ";
		}
		System.out.println(result);
	}
}
