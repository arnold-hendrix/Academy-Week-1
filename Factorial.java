package introtojava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		
		if (number <= 0) {
			System.out.println(0);
		}
		else 
		{
			System.out.println(result);
		}
		scanner.close();
	}

}
