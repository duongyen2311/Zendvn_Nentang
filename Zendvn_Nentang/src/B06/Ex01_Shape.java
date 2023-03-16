package B06;

public class Ex01_Shape {
	public static void main(String[] args) {
		int height = 5;
		String shape = "";
		String symbol = "";
		String leftNumber = "";
		String centerNumber = "";

		for (int line = 1; line <= height; line++) {
			symbol = "-".repeat(height - line);
			leftNumber = "";
			for (int i = 1; i <= line - 1; i++) {
				leftNumber += i;
			}
			StringBuilder rightNumber = new StringBuilder(leftNumber);
			rightNumber.reverse().toString();
			centerNumber = line + "";
			shape = symbol + leftNumber + centerNumber + rightNumber + symbol;
			System.out.println(shape);
		}
	}
}
