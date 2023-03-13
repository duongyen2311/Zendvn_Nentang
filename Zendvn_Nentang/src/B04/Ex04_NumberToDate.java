package B04;

public class Ex04_NumberToDate {

	public static void main(String[] args) {
		int yourNumber = 25;
		int firstNumber = yourNumber / 10;
		int secondNumber = yourNumber % 10;
		String result = "Khong the giai ma";
		// firstNumber = 1
		String[] arrEnglish = { "0", "1", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday" };
		// firstNumber = 2
		String[] arrVietnamese = { "0", "1", "Thu hai", "Thu ba", "Thu tu", "Thu nam", "Thu sau", "Thu bay",
				"Chu nhat" };

		if (firstNumber >= 1 && firstNumber <= 2 && secondNumber >= 2 && secondNumber <= 8) {
			if (firstNumber == 1) {
				result = arrEnglish[secondNumber];
			} else
				result = arrVietnamese[secondNumber];
		}
		System.out.println(result);
	}
}