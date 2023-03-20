package B08;

public class Ex02_StringAdv {

	public static void main(String[] args) {
		String inputCategory = "D1|Lap trinh web$D2|Lap trinh phan mem$D3|Lap trinh di dong$";
		String inputCourse = "1|HTML CSS|D1=2|PHP|D1=3|Laravel|D1=4|Winform|D2=5|NodeJS|D2=6|React Native|D3";
		String[] inputCateArr = inputCategory.split("[|$]");
		String[] inputCourseArr = inputCourse.split("[|=]");
		String result = "";
//		String cate = "";
//		int courseNumber = 0;
//		String course = "";
//		C1
//		for (int i = 0; i < inputCateArr.length; i++) {
//			courseNumber = 0;
//			course = "";
//			if (i % 2 == 1) {
//				cate = inputCateArr[i];
//				for (int j = 0; j < inputCourseArr.length; j++) {
//					if (inputCourseArr[j].equalsIgnoreCase(inputCateArr[i - 1])) {
//						courseNumber++;
//						course += ", " + inputCourseArr[j - 1];
//					}
//				}
//				course = course.substring(1);
//				System.out.printf("%s (%d): %s \n", cate, courseNumber, course);
//			}
//		}

		int index = 1;
		for (int i = 1; i < inputCateArr.length; i += 2) {
			String categoryId = inputCateArr[i - 1];
			String categoryName = inputCateArr[i];
			String record = index + "." + categoryName + ": ";

			for (int j = 1; j < inputCourseArr.length; j += 3) {
				if (inputCourseArr[j + 1].equals(categoryId)) {
					record += inputCourseArr[j] + ", ";
				}
			}

			record = record.substring(0, record.length() - 2);
			result += record + "\n";
			index++;
		}
		System.out.println(result);
	}
}
