package part01;

import java.util.Scanner;

public class T08_2Add2Nums {
	
	public static double add2Nums(Double num1, Double num2) {
		return num1 + num2;
	}
	
public static void main(String[] args) {
		
	double num1, num2;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter 1st Number: ");
	num1 = s.nextDouble();
	System.out.println("Enter 2nd Number: ");
	num2 = s.nextDouble();
	
	System.out.println(add2Nums(num1, num2));
//	System.out.println(add2Nums(52.15, 5.3));
	
		
	s.close();

	}

}
