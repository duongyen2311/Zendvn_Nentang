package B03;

public class Ex02_SumElement {
	public static void main(String[] args) {
		int[] arrInt = { 1, 2, 4, 8, 0 };
		int sum = 0;
		int sumEven = 0;

		for (int element : arrInt) {
			sum += element;
			if (element % 2 == 0)
				sumEven += element;
		}
		System.out.println("Tong phan tu: " + sum);
		System.out.println("Tong phan chan: " + sumEven);
		System.out.println("Tong phan le: " + (sum - sumEven));
	}
}
