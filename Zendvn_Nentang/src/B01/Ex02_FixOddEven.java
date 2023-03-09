package B01;

public class Ex02_FixOddEven {
	public static void main(String[] args) {
		int number = -1;
		String str1 = "dương";
		String str2 = "chẵn";

		if (number < 0)
			str1 = "âm";
		//Bị bug trong trường hợp number < 0, nên cần thêm trị tuyệt đối
		if (Math.abs(number) % 2 == 1)
			str2 = "lẻ";

		System.out.println("nguyên " + str1 + " " + str2);

	}


}
