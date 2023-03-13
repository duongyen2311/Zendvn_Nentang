package B03;

public class Ex03_CheckExist {

	public static void main(String[] args) {
		int[] arrInt = { 0, 2, 3, 5, 6 };
		int number = 2;
		String isExist = "Khong ton tai";
		boolean flagCheckExist = false;
		// Can them break
		// Neu toi uu khi co nhieu cong viec sau khi thoa man dieu kien: dung flag
		for (int element : arrInt) {
			if (element == number) {
				flagCheckExist = true;
				break;
			}
		}
		if (flagCheckExist == true) {
			isExist = "Ton tai";
			// CV => 50 dong code
		}
		System.out.println(isExist);
	}
}
