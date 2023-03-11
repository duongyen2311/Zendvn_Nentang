package B02;

public class BMI {

	public static void main(String[] args) {
		int yourWeight = 84;
		int yourHeight = 178;

		double yourHeighInMeter = yourHeight / 100.0;
		double BMI = yourWeight / (Math.pow(yourHeighInMeter, 2));
		double RoundBMI = (double) Math.ceil(BMI * 10) / 10;

		if (RoundBMI >= 30) {
			System.out.println("BMI: " + RoundBMI + " Beo phi");
		} else if (RoundBMI >= 25) {
			System.out.println("BMI: " + RoundBMI + " Thua can");
		} else if (RoundBMI >= 18.5) {
			System.out.println("BMI: " + RoundBMI + " Binh thuong");
		} else {
			System.out.println("BMI: " + RoundBMI + " Thieu can");
		}
	}

}
