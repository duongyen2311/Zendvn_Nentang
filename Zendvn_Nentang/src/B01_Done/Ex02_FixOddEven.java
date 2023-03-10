package B01_Done;

public class Ex02_FixOddEven {
	public static void main(String[] args) {
		int number = -1;
		String str1 = "dương";
		String str2 = "chẵn";

		if (number < 0)
			str1 = "âm";
		//Can them tri tuyet doi
		//C2: if(number % 2 == 1||number % 2 ==-1)
		if (Math.abs(number) % 2 == 1)
			str2 = "lẻ";

		System.out.println("nguyên " + str1 + " " + str2);

	}


}
