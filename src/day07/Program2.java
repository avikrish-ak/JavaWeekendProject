package day07;

public class Program2 {

	public static void main(String[] args) {
		
		long x=0;
		long y=1;
		long z;
		
		int a=1;
		while(a<=50)
		{
			System.out.println(x);
			z=x+y;//new value
			x=y;
			y=z;
			a=a+1;
		}
		
		

	}

}
