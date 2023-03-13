package B04;

public class Ex04_NumberToDate {

	public static void main(String[] args) {
		int yourNumber = 20;
		if (yourNumber >= 12 && yourNumber <= 18 || yourNumber >= 22 && yourNumber <= 28) {
			checkNumber(yourNumber);
		} else
			System.out.println("Khong the giai ma");
	}

	public static void checkNumber(int yourNumber) {
		String stringNumber = yourNumber + "";
		int firstNumber = Integer.parseInt(stringNumber.charAt(0) + "");
		int secondNumber = Integer.parseInt(stringNumber.charAt(1) + "");
		// firstNumber = 1
		String[] arrEnglish = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		// firstNumber = 2
		String[] arrVietnamese = { "Thu hai", "Thu ba", "Thu tu", "Thu nam", "Thu sau", "Thu bay", "Chu nhat" };
		String result = "";
		if (firstNumber == 1) {
			result = arrEnglish[secondNumber - 2];
		} else
			result = arrVietnamese[secondNumber - 2];
		System.out.println(result);

	}
}