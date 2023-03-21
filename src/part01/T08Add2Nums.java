package part01;

import java.util.Scanner;

public class T08Add2Nums {

	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st Number: ");
		num1 = s.nextDouble();
		System.out.println("Enter 2nd Number: ");
		num2 = s.nextDouble();
		
		System.out.println("Sum of the given numbers is "+ (num1 + num2));
		
		s.close();
		

	}

}
