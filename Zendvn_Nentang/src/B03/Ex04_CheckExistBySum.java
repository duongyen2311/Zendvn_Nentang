package B03;

public class Ex04_CheckExistBySum {

	public static void main(String[] args) {
		int[] arrInt = { 1, 2, 4, 3, 3 };
		int number = 5;
		int length = arrInt.length;
		String notice = "Failed";
		boolean flagCheck = false;

		for (int i = 0; i < length - 1; i++) {
			if (arrInt[i] + arrInt[i + 1] == number) {
				flagCheck = true;
				break;
			}
		}
		if (flagCheck == true)
			notice = "Success";
		// 50 CV khac
		System.out.println(notice);
	}

}
