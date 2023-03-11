package B02;

public class ShapePlusBasic {

	public static void main(String[] args) {
		int height = 5;
		int line = 0;
		String record = "";

		for (line = 1; line <= height; line++) {
			record = "";
			for (int i = 1; i <= line; i++) {
				record += "+";
			}
			System.out.println(record);
		}
	}
}
