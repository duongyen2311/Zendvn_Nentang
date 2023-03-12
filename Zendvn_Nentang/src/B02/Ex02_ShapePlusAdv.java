package B02;

public class Ex02_ShapePlusAdv {

	public static void main(String[] args) {
		//C1
//		int height = 6;
//		int line = 0;
//		String record = "";
//
//		for (line = 1; line <= height; line++) {
//			record = "";
//			for (int i = 1; i <= line; i++) {
//				if(line%2==1) record += "+";
//				if(line%2==0) record += "=";
//			}
//			System.out.println(record);
//
//		}
		//C2
		int height = 5;
		String record = "";
		String shape = "";
		String character = "";
		for (int i = 1; i <= height; i++) {
			character = (i%2==0)?"=":"+";
			record = i+character.repeat(i);
			shape += record + "\n";
		}
		System.out.println(shape);

	}
}
