package part01;

import java.util.Scanner;

public class T10_PerfectSquare {

	public static void main(String[] args) {

		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = s.nextInt();
		s.close();
		
		int sqrt = (int) Math.sqrt(num);
		
		int numsquare = sqrt*sqrt;
		 
		if (num == numsquare) {
			System.out.println("The given number is a perfect Square");
		} else {
			System.out.println("The given number is not a perfect Square");
		}
		
	
		
		
		
		
		

	}

}
