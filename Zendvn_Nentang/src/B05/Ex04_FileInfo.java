package B05;

public class Ex04_FileInfo {

	public static void main(String[] args) {
		String str = "D:/GoogleDrive/Doing/__psd/luutruonghailan/abc.php";
		// Lay abc.php
		String[] arrStr = str.split("/");
		String fileName = arrStr[arrStr.length - 1];

		// Lay name + extension
		String[] fileInfo = fileName.split("\\.");
		String name = fileInfo[0];
		String extension = fileInfo[1];

		System.out.println("Name: " + name);
		System.out.println("Extension: " + extension);

	}
}
