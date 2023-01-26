package introtojava;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25;
		int num2 = 75;
		int addition = num1 + num2;
		int product = num1 * num2;
		int difference = num2 - num1;
		int division = num2 / num1;
		System.out.println("The sum of the two numbers is: " + addition);
		System.out.println("The difference of the two numbers is: " + difference);
		System.out.println("The product of the two numbers is: " + product);
		System.out.println("The division of the two numbers is: " + division);
		num1 = (int)(Math.random() * 101);
		num2 = (int)(Math.random() * 101);
		System.out.println(num1);
		System.out.println(num2);

	}

}
