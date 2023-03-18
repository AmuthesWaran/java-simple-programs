package part01;

import java.util.Scanner;

public class T07SimpleCalcUsingSwitch {

	public static void main(String[] args) {
//		Java Program to Make a Simple Calculator Using switch...case 
		
		
		Double num1, num2, result;
		char operator;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter anyone of the following operator");
		System.out.println("+, -, *, / ");
		
		operator = s.next().charAt(0);
		
		System.out.println("Please enter the 1st number: ");
		num1 = s.nextDouble();
		System.out.println("Please enter the 2nd number: ");
		num2 = s.nextDouble();
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println( num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println( num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println( num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println( num1 + " " + operator + " " + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
		s.close();

	}

}
