package B01;

import java.util.Scanner;

public class Ex04_Salary {

	public static void main(String[] args) {
		//Salary trên mỗi giờ làm việc
		int perHour = 20;
		//Chi phí review
		int reviewCost = 0;
		Scanner sc = new Scanner(System.in);
		//Lương thực nhận
		int netSalary = 0;

		//Dev nhập thời gian làm việc
		System.out.println("Mời bạn nhập thời gian làm việc");
		int timeDoing = sc.nextInt();
		//Dev nhập số dòng code
		System.out.println("Mời bạn nhập số dòng code");
		int totalLine = sc.nextInt();

		//Tính toán chi phí review
		if (totalLine >= 20) {
			reviewCost = 5;
		} else if (totalLine >= 10) {
			reviewCost = 2;
		} else {
			reviewCost = 1;
		}

		//Lương thực nhận
		if (totalLine > 0 && timeDoing > 0) {
			netSalary = perHour * timeDoing - reviewCost;
			System.out.println("Net salary = " + netSalary);
		}
		//Các TH không hợp lệ
		else {
			System.out.println("Thông tin thời gian làm việc hoặc số dòng code không hợp lệ \nMời bạn nhập lại");
		}
	}

}
