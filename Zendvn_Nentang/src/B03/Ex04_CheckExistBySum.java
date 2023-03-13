package B03;

public class Ex04_CheckExistBySum {

	public static void main(String[] args) {
		int[] arrInt = { 1, 2, 4, 3, 2 };
		int number = 5;
		int length = arrInt.length;
		String notice = "";

		for (int i = 0; i < length - 1; i++) {
			if (arrInt[i] + arrInt[i + 1] == 5)
				notice = "Success";

		}
		System.out.println(notice);
	}

}
