package day05;

public class Program1 {

	public static void main(String[] args) {
		add(10,20);
		add(20,40);
		add(3.3,7.9);
		add(6.6,4.2);
		add(1,2,3);
		add(1.1,2.2);
	}
	
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(double a,double b)//overloading method
	{
		System.out.println(a+b);
	}
	
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	

}
