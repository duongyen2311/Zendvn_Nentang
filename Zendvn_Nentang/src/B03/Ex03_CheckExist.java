package B03;

public class Ex03_CheckExist {

	public static void main(String[] args) {
		int[] arrInt = { 0, 2, 3, 5, 6 };
		int number = 0;
		String isExist = "Khong ton tai";
		boolean flagCheckExists = false;

		for (int element : arrInt) {
			if (element == number) {
				flagCheckExists = true;
				break;
			}

		}
		if (flagCheckExists == true)
			isExist = "Ton tai";
		//50 CV 
		System.out.println(isExist);
	}

}
