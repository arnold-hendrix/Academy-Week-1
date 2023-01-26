package introtojava;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int val;
		System.out.println("Enter a number: ");
		val = scanner.nextInt();
		if (val >= 0) {
			System.out.println(val + " is a positive number");
		}
		else {
			System.out.println(val + " is a negative number");
		}
	}
}
