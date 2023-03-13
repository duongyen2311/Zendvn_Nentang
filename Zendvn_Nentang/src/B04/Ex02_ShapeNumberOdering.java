package B04;

public class Ex02_ShapeNumberOdering {
	public static void main(String[] args) {
		int height = 5;
		String shape = "";
		for (int line = 1; line <= height; line++) {
			String space = " ".repeat(height - line);
			String number = "";
			for (int i = 1; i <= line; i++) {
				number += i;
			}
			shape += space + number + "\n";
		}
		System.out.println(shape);
	}
}
