package B01;

public class Ex02_FixOddEven {
	public static void main(String[] args) {
		int number = -1;
		String str1 = "duong";
		String str2 = "chan";

		if (number < 0)
			str1 = "am";
		//Can them tri tuyet doi
		//C2: if(number % 2 == 1||number % 2 ==-1)
		if (Math.abs(number) % 2 == 1)
			str2 = "le";

		System.out.println("nguyen " + str1 + " " + str2);

	}


}
