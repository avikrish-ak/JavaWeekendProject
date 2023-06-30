package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:- ");
		int size = scan.nextInt();
		int x[] = new int[size];
		for(int i=0;i<size;i=i+1)
		{
			System.out.println("Enter the value of index :- "+i);
			x[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(x));
		scan.close();
	}

}
