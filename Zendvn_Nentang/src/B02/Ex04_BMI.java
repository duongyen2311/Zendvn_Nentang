package B02;

public class Ex04_BMI {

	public static void main(String[] args) {
		int yourWeight = 84;
		int yourHeight = 178;

		double yourHeighInMeter = (double) yourHeight / 100;
		double bmi = yourWeight / (yourHeighInMeter * yourHeighInMeter);
		double roundBmi = (double) Math.ceil(bmi * 10) / 10;

		String result = "";
		if (roundBmi >= 30) {
			result = " Beo phi";
		} else if (roundBmi >= 25) {
			result = " Thua can";
		} else if (roundBmi >= 18.5) {
			result = " Binh thuong";
		} else {
			result = " Thieu can";
		}

		System.out.println("BMI: " + roundBmi + result);
	}

}
