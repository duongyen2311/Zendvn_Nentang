package B06;

public class Ex02_RemoveCharacter {
	public static void main(String[] args) {
		String str = "ab@#AB69C!}+21";
		String strNumber = "";
		String strCharacter = "";
		String strSpecial = "";
		String[] strArray = str.split("");

		for (String element : strArray) {
			if (element.matches("\\d") == true) {
				strNumber += element;
			}
			if (element.matches("[A-Za-z]") == true) {
				strCharacter += element;
			}
			if (element.matches("\\W") == true) {
				strSpecial += element;
			}
		}
		System.out.println("Chuoi so: " + strNumber);
		System.out.println("Chuoi chu: " + strCharacter);
		System.out.println("Chuoi dac biet: " + strSpecial);
	}
}
