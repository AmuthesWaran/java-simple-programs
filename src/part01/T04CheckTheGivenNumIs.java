package part01;

import java.util.Scanner;

public class T04CheckTheGivenNumIs {

	public static void main(String[] args) {
		
//		Java Program to Check Whether a Number is Positive or Negative 

		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter an Integer: ");
		int givenInt = s.nextInt();
		
		if (givenInt > 0) {
			System.out.println(givenInt + " is a positive number");
		}
		else if (givenInt < 0) {
			System.out.println(givenInt + " is a negative number");
		}
		else {
			System.out.println(givenInt + " is a neural number");
		}
		
		s.close();
		

	}

}
