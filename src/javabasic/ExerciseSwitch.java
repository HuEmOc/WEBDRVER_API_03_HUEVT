package javabasic;

import java.util.Scanner;

public class ExerciseSwitch {

	private static Scanner kB;

	public static void main(String[] args) {
		String dayString1, dayString2, dayString3;
		kB = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int day = kB.nextInt();
		if (day == 1) {
			dayString1 = "Saturday";
			dayString2 = "Sunday";
		} else if (day == 2) {
			dayString2 = "Sunday";
		} else if (day == 3) {
			dayString3 = "Monday";
			System.out.println(dayString3);
		} else if (day == 4) {
			dayString1 = "Tuesday";
			dayString2 = "Wednesday";
		} else if (day == 5) {
			dayString2 = "Wednesday";
		} else
			dayString3 = "Invalid day";

	}

}
