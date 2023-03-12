package B02;

public class Ex04_BMI {

	public static void main(String[] args) {
		int yourWeight = 84;
		int yourHeight = 178;

		double yourHeighInMeter = yourHeight / 100.0;
		double bmi = yourWeight / (Math.pow(yourHeighInMeter, 2));
		double roundBmi = (double) Math.ceil(bmi * 10) / 10;
		String result = "";

		if (roundBmi >= 30) {
			result = "BMI: " + roundBmi + " Beo phi";
		} else if (roundBmi >= 25) {
			result ="BMI: " + roundBmi + " Thua can";
		} else if (roundBmi >= 18.5) {
			result ="BMI: " + roundBmi + " Binh thuong";
		} else {
			result ="BMI: " + roundBmi + " Thieu can";
		}
		
		System.out.println(result);
	}

}
