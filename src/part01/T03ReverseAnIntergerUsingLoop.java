package part01;

import java.util.Scanner;

public class T03ReverseAnIntergerUsingLoop {

	public static void main(String[] args) {
		
//		Java Program to Reverse a Number using loop concepts
		
		int givenInt;
		String reversed = "";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter an interger to be reversed: ");
		givenInt = s.nextInt();
		
		String stringInt = Integer.toString(givenInt);
		
		for (int i = stringInt.length() - 1; i >= 0; i--) {
//			reversed = reversed + stringInt.charAt(i);
			reversed += stringInt.charAt(i);
			
		}
		
		System.out.println("Reveresed given int is: \n" + reversed);
		
		s.close();

	}

}
