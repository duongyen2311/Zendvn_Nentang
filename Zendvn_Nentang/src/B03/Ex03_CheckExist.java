package B03;

public class Ex03_CheckExist {

	public static void main(String[] args) {
		int[] arrInt = { 0, 2, 3, 5, 6 };
		int number = 4;
		String isExist = "Khong ton tai";

		for (int element : arrInt) {
			if (element == number)
				isExist = "Ton tai";

		}
		System.out.println(isExist);
	}

}
