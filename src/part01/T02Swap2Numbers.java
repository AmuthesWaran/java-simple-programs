package part01;

import java.util.Scanner;

public class T02Swap2Numbers {
	
	public static void main(String[] args) {
		
//		Java Program to Swap Two Numbers
		
		int num1;
		int num2;
		int temp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your 1st Number: ");
		num1 = s.nextInt();
		System.out.println("Please enter your 2nd Number: ");
		num2 = s.nextInt();
		
		System.out.println("----------Before Swapping----------");
		System.out.println("1st Number is: " + num1);
		System.out.println("2nd Number is: " + num2);
		
		// Logic
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("----------After Swapping----------");
		System.out.println("1st Number is: " + num1);
		System.out.println("2nd Number is: " + num2);
		
		s.close();
		
		
	}

}
