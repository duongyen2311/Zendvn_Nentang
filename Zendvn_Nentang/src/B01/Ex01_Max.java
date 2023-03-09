package B01;

public class Ex01_Max {

	public static void main(String[] args) {
		int numberOne = 285;
		int numberTwo = 125;
		int numberThree = 185;
		int numberFour = 325;
		//Số lớn nhất giữa numberOne và numberTwo
		int result01 = Math.max(numberOne, numberTwo);
		//Số lớn nhất giữa max của numberOne, numberTwo và numberThree
		int result02 = Math.max(result01, numberThree);
		//Số lớn nhất trong 4 số đã cho
		System.out.println("Max: "+Math.max(result02, numberFour));
	}

}
