package B01;

//Nen dat hang so de de chinh sua
//Nen gan gia tri ban dau va in ra 1 lan gia tri result

public class Ex04_Salary {

	public static void main(String[] args) {
		final int PER_HOUR = 20;
		int reviewCost = 0;
		int netSalary = 0;

		// Thong tin can nhap
		int timeDoing = 1;
		int totalLine = 20;
		String result = "Thong tin khong hop le \nMoi nhap lai";

		final int REVIEW_FEE_LEVEL_ONE = 1;
		final int REVIEW_FEE_LEVEL_TWO = 2;
		final int REVIEW_FEE_LEVEL_THREE = 5;

		if (totalLine >= 20) {
			reviewCost = REVIEW_FEE_LEVEL_THREE;
		} else if (totalLine >= 10) {
			reviewCost = REVIEW_FEE_LEVEL_TWO;
		} else {
			reviewCost = REVIEW_FEE_LEVEL_ONE;
		}

		if (totalLine > 0 && timeDoing > 0) {
			netSalary = PER_HOUR * timeDoing - reviewCost;
			result = "Salary:" + netSalary + "$";
		}
		System.out.println(result);
	}

}
