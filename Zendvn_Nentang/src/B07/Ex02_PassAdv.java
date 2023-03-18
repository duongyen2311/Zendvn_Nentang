package B07;

public class Ex02_PassAdv {
	
	public static void main(String[] args) {
		String input = "2c+)1o!@(*&!y@&chi&^c!@#o3co$23%%^nd$#$!uo5ng";
		String key = input.replaceAll("\\D", "");
		input = input.replaceAll("\\d|\\W", "");
		int keyLength = key.length();
		String[] keyString = key.split("");
		int[] keyNumber = new int[keyLength];
		int startIndex = 0;
		String result = "";

		for (int i = 0; i < keyLength; i++) {
			keyNumber[i] = Integer.parseInt(keyString[i]);
			String word = input.substring(startIndex, startIndex + keyNumber[i]);
			startIndex += keyNumber[i];
			String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
			result += cap + " ";
		}
		System.out.println(result);
	}
}
