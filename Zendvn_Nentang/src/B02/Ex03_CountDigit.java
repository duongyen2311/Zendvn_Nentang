package B02;

public class Ex03_CountDigit {

	public static void main(String[] args) {
//		int yourNumber = 123456789;
//		String one = "1";
//		String zero = "";
//		int characterCounter = 0;
//		
//		for (int i = 1; i <= 9; i++) {
//			if ((yourNumber / Integer.parseInt(one + zero)) >= 1) {
//				characterCounter += 1;
//				zero += "0";
//			}
//		}
//		System.out.println(yourNumber + " co " + characterCounter + " chu so");
//	}

		// Java convert number to String
		// Java count string length
		//C2
		int yourNumber = 12345678;
		String strNumber = Integer.toString(yourNumber);
		int characterCounter = strNumber.length();
		System.out.println(yourNumber + " co " + characterCounter + " chu so");
		

	}
}
