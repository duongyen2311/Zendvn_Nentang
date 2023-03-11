package B02;

public class ShapePlusAdv {

	public static void main(String[] args) {
		int height = 6;
		int line = 0;
		String record = "";

		for (line = 1; line <= height; line++) {
			record = "";
			for (int i = 1; i <= line; i++) {
				if(line%2==1) record += "+";
				if(line%2==0) record += "=";
			}
			System.out.println(record);

		}

	}
}
