package B03;

public class Ex01_ShapeNumber {

	public static void main(String[] args) {
		int height = 6;
		String line = "";
		String shape = "";
		String character = "";

		for (int i = 1; i <= height; i++) {
			character = (i % 2 == 0) ? "+" : "-";
			line = i + character.repeat(i);
			shape += line + "\n";
		}
		System.out.println(shape);
	}

}
