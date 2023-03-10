package B01_Done;

//Phai format code
//Khong dat ten bien la tieng viet
//Click vào item muon rename/Refactor --> tu dong chuyen toan bo
//Dua vao hang so nhung gia tri de thay doi
//Khai bao gia tri ban dau sau do ghi de de toi uu code, in ra 1 lan
public class Ex03_Film {

	public static void main(String[] args) {
		int age = 15;
		final int AGE_LIMIT_VIEW_FILM = 15;
		final String FILM_NAME = "Thế giới lập trình";
		String notice = "Bạn không được xem phim ";
		if (age >= AGE_LIMIT_VIEW_FILM) {
			notice = "Bạn được xem phim ";
		}
		System.out.println(notice + FILM_NAME);
	}

}
