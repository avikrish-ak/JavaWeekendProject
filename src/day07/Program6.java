package day07;

public class Program6 {

	public static void main(String[] args) {
		
		int[] x;
		x= new int[10];
		
		x[0]=125;
		x[6]=126;
		x[2]=-45;
		x[5]=65;
		
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		
		for(int i=0;i<x.length;i=i+1)
		{
			System.out.println(x[i]);
		}
		System.out.println("for-each");
		for(int y:x)
		{
			System.out.println(y);
		}
		System.out.println("____________________");
		
		int a[]= {3,6,7,8,9,9,10,35,36};
		
		System.out.println(a[2]);
		a[2]=123;
		System.out.println(a[2]);
		
		
		System.out.println(a[25]);
		

	}

}
