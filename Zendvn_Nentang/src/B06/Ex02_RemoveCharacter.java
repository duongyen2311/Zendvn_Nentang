package B06;

public class Ex02_RemoveCharacter {
	public static void main(String[] args) {
		// C1
		String str = "ab@#AB69C!}+21";
//		String strNumber = "";
//		String strCharacter = "";
//		String strSpecial = "";
//		String[] strArray = str.split("");
//
//		for (String element : strArray) {
//			if (element.matches("\\d") == true) {
//				strNumber += element;
//			}
//			if (element.matches("[A-Za-z]") == true) {
//				strCharacter += element;
//			}
//			if (element.matches("\\W") == true) {
//				strSpecial += element;
//			}
//		}
		// C2 -Nhanh hon
		String strNumber = str.replaceAll("\\D", "");
		String strCharacter = str.replaceAll("\\d|\\W", "");
		String strSpecial = str.replaceAll("\\w", "");

		System.out.println("Chuoi so: " + strNumber);
		System.out.println("Chuoi chu: " + strCharacter);
		System.out.println("Chuoi dac biet: " + strSpecial);
	}
}
