package javabasic;

import java.util.Scanner;

public class ExerciseIfElse {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int x = s.nextInt();
		if (x > 0) {
			System.out.println("The value is positive");
		} else if (x < 0) {
			System.out.println("The value is negative");
		} else {
			System.out.println("The value is  zero");
		}
		System.out.println("Good Bye!");
		
	}
}
