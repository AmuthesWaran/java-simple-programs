package part01;

import java.util.Scanner;

public class T09MultiplicationTables {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n, m , t;
		
		
		System.out.println("Enter the Tables that you want to print: ");
		n = s.nextInt();
		System.out.println("How many times to multiply: ");
		m = s.nextInt();
		
		s.close();
		
		for (int i = 1; i <= m; i++) {
			
			t = n*i;
			
			System.out.println(n+"x"+i+"="+t);
		}
				
				
		
		
	}

}
