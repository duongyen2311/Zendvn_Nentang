package B06;

public class Ex04_MaxTime {

	public static void main(String[] args) {
		String str = "php/127/typescript/12/jquery/190/angular/50";
		String[] strArr = str.split("/");
		int length = strArr.length;
		int maxTime = Integer.parseInt(strArr[1]);
		String name = strArr[0];
		for (int i = 0; i < length; i++) {
			if (i % 2 == 1) {
				if (Integer.parseInt(strArr[i]) > maxTime) {
					maxTime = Integer.parseInt(strArr[i]);
					name = strArr[i - 1];
				}
			}
		}
		System.out.println("Name: " + name);
		System.out.println("Time: " + maxTime);
	}

}
