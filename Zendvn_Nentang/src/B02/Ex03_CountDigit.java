package B02;

public class CountDigit {

	public static void main(String[] args) {
		int yourNumber = 123456789;
		String one = "1";
		String zero = "";
		int characterCounter = 0;
		
		for (int i = 1; i <= 9; i++) {
			if ((yourNumber / Integer.parseInt(one + zero)) >= 1) {
				characterCounter += 1;
				zero += "0";
			}
		}
		System.out.println(yourNumber + " co " + characterCounter + " chu so");
	}

}
