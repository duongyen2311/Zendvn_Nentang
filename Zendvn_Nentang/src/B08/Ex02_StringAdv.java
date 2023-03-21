package B08;

public class Ex02_StringAdv {

	public static void main(String[] args) {
		String inputCategory = "D1|Lap trinh web$D2|Lap trinh phan mem$D3|Lap trinh di dong$";
		String inputCourse = "1|HTML CSS|D1=2|PHP|D1=3|Laravel|D1=4|Winform|D2=5|NodeJS|D2=6|React Native|D3";
		String[] inputCateArr = inputCategory.split("[|$]");
		String[] inputCourseArr = inputCourse.split("[|=]");
		String result = "";
//		1.Lap trinh web (3) : HTML CSS, PHP, Laravel
//		2.Lap trinh phan mem (2) : HTML CSS, PHP, Laravel, Winform, NodeJS
//		3.Lap trinh di dong (1) : HTML CSS, PHP, Laravel, Winform, NodeJS, React Native
		int index = 1;
		String courseName = "";
		int count = 0;
		for (int i = 1; i < inputCateArr.length; i += 2) {
			courseName = "";
			count = 0;
			String categoryId = inputCateArr[i - 1];
			String categoryName = inputCateArr[i];
			String record = index + "." + categoryName;
			for (int j = 1; j < inputCourseArr.length; j += 3) {
				if (inputCourseArr[j + 1].equals(categoryId)) {
					courseName += inputCourseArr[j] + ", ";
					count++;
				}
			}

			result += record + " (" + count + ") " + ": " + courseName;
			result = result.substring(0, result.length() - 2) + "\n";
			index++;
		}
		System.out.println(result);
	}
}
