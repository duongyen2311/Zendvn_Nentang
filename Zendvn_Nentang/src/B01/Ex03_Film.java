package B01;

import java.util.Scanner;

public class Ex03_Film {

	public static void main(String[] args) {
		//Khách hàng nhập số tuổi
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập số tuổi của bạn: ");
		int soTuoi = sc.nextInt();
		//TH dưới 15 tuổi
		if (soTuoi < 15&&soTuoi>=0) {
			System.out.println("Bạn không được xem phim Thế giới lập trình");
		}
		//TH trên 15 tuổi và nhỏ hơn tuổi thọ hợp lý (115)
		else if (soTuoi >= 15&&soTuoi <=115) {
			System.out.println("Bạn được xem phim Thế giới lập trình");
		}
		//TH nhập số tuổi không hợp lệ
		else {
			System.out.println("Số tuổi không hợp lệ, mời bạn nhập lại");
		}
	}
}
