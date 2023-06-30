package day07;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int[] x= {20,30,45,65,78,19,28,37};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		//int[] y = x;

		int[] y =Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(y));
		x[0]=12345;
		System.out.println("After Change:- ");
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(x);
		System.out.println(y);

	}

}
