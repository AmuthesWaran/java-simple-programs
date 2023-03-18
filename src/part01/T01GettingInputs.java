package part01;

import java.util.Scanner;

public class T01GettingInputs {
	
	public static void main(String[] args) {
		
//		Java Program to Print user input
		
		int number;
		float floatNum;
		double doubleNum;
		String text;
		char letter;
		boolean bool;
		
		Scanner s = new Scanner(System.in);
		
//		https://www.w3schools.com/java/java_data_types.asp
//		Data Type	Size		Description
//		byte		1 byte		Stores whole numbers from -128 to 127
//		short		2 bytes		Stores whole numbers from -32,768 to 32,767
//		int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
//		long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//		float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//		double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
//		boolean		1 bit		Stores true or false values
//		char		2 bytes		Stores a single character/letter or ASCII values
		
		System.out.println("Please enter an Integer: ");
		number = s.nextInt();
		
		System.out.println("Please enter a float: ");
		floatNum = s.nextFloat();
		
		System.out.println("Please enter a double: ");
		doubleNum = s.nextDouble();
		
		System.out.println("Please enter a String: ");
		text = s.next();
		
		System.out.println("Please enter a char: ");
		letter = s.next().charAt(0);
		
		System.out.println("Please enter a boolean: ");
		bool = s.nextBoolean();
		
		System.out.println(number + " is a " + ((Object)number).getClass().getSimpleName());
		System.out.println(floatNum + " is a " + ((Object)floatNum).getClass().getSimpleName());
		System.out.println(doubleNum + " is a " + ((Object)doubleNum).getClass().getSimpleName());
		System.out.println(text + " is a " + ((Object)text).getClass().getSimpleName());
		System.out.println(letter + " is a " + ((Object)letter).getClass().getSimpleName());
		System.out.println(bool + " is a " + ((Object)bool).getClass().getSimpleName());
		
		s.close();
		
	}
}
