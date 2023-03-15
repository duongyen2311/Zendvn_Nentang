package B05;

public class Ex04_FileInfo {

	public static void main(String[] args) {
		String str = "D:/GoogleDrive/Doing/__psd/luutruonghailan/abc.php";
		// Lay abc.php
		String[] arrStr1 = str.split("/");
		int length = arrStr1.length - 1;
		String fileFullName = arrStr1[length];

		// Lay name + extension
		String[] arrStr2 = fileFullName.split("\\.");
		String name = arrStr2[0];
		String extension = arrStr2[1];

		System.out.println("Name: " + name);
		System.out.println("Extension: " + extension);

	}
}
