package B06;

public class Ex03_CountId {

	public static void main(String[] args) {
		String id = "69";
		String str = "78, 60,62,68,69,68,73,85,66 ,69,65,74,63,67 ,65,64,68,73,75,69,73,169";
		int count = 0;

		String[] strArray = str.split("\\s?,\\s?");
		for (String element : strArray) {
			if (element.equals(id)) {
				count++;
			}
		}
		System.out.println(id + " xuat hien " + count + " lan");
	}

}
