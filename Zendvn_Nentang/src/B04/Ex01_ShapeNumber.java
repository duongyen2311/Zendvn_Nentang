package B04;

public class Ex01_ShapeNumber {

	public static void main(String[] args) {
		int height = 5;
		String shape = "";
		for (int line = 1; line <= height; line++) {
			String space = " ".repeat(height - line);
			String number = (line + "").repeat(line);
			shape += space + number + "\n";
		}
		System.out.println(shape);
	}

}
