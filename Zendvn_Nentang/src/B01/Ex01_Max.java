package B01;

//Code chua dc tuong minh
public class Ex01_Max {
	public static void main(String[] args) {
		int numberOne = 285;
		int numberTwo = 125;
		int numberThree = 185;
		int numberFour = 325;
		//So lon nhat giua numberOne va numberTwo
		int result01 = Math.max(numberOne, numberTwo);
		//So lon nhat giua numberThree va numberFour
		int result02 = Math.max(numberThree, numberFour);
		//So lon nhat trong 4 so
		System.out.println("Max: "+Math.max(result01, result02));
	}
}
