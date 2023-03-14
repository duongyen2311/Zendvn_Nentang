package B05;

public class Ex01_ShapeNumber {

	public static void main(String[] args) {
		int height = 5;
		String shape = "";
		String symbol = "";
		String number = "";
		for (int line = 1; line <= height; line++) {
			symbol = "";
			number = "";
			symbol += "-".repeat(height - line);
			number += (line + "").repeat(line * 2 - 1);
			shape += (symbol + number + symbol + "\n");
		}
		System.out.println(shape);
	}
}
