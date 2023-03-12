package B02;

public class Ex01_ShapePlusBasic {

	public static void main(String[] args) {
		// C1
//		int height = 5;
//		int line = 0;
//		String record = "";
//
//		for (line = 1; line <= height; line++) {
//			record = "";
//			for (int i = 1; i <= line; i++) {
//				record += "+";
//			}
//			System.out.println(record);
//		}
		// C2: dung 1 for
		int height = 5;
		String record = "";
		String shape = "";
		for (int i = 1; i <= height; i++) {
			record = "+".repeat(i);
			shape += record + "\n";
		}
		System.out.println(shape);
	}
}
