package day05.test;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of a:- ");
		int a= scan.nextInt();
		
		System.out.println("Enter the Value of b:- ");
		int b = scan.nextInt();
		
		scan.close();
	
		calculator(a,b);

	}
	
	public static void calculator(int a, int b)
	{
		System.out.println(a+b);	
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	
}
