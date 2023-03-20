package B08;

public class Ex01_MaxTime {

	public static void main(String[] args) {
		String inputId = "abc=java;def=android;nfv=php";
		String inputTime = "abc=20;nfv=1400;def=90";
		String[] inputTimeArr = inputTime.split("[=;]");
		int maxTime = Integer.parseInt(inputTimeArr[1]);
		String id = "";
		String course = "";

		for (int i = 1; i < inputTimeArr.length; i += 2) {
			int elementTime = Integer.parseInt(inputTimeArr[i]);
			if (elementTime > maxTime) {
				maxTime = elementTime;
				id = inputTimeArr[i - 1];
			}
			
		}
		String[] inputIdArr = inputId.split("[=;]");
		for (int j = 0; j < inputTimeArr.length; j += 2) {
			if (inputIdArr[j].equalsIgnoreCase(id)) {
				course = inputIdArr[j + 1];
				break;
			}
		}
		System.out.printf("Khoa hoc co thoi luong video nhieu nhat: %s - %s - %d", id, course, maxTime);
	}

}
