package day05;


public class Program4 {

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	protected static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	static void mul(int a,int b)
	{
		System.out.println(a*b);
	}

	public void add_ns(int a,int b)
	{
		System.out.println(a+b);
	}
	private  void sub_ns(int a,int b)
	{
		System.out.println(a-b);
	}
	protected  void div_ns(int a,int b)
	{
		System.out.println(a/b);
	}
	 void mul_ns(int a,int b)
	{
		System.out.println(a*b);
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("static methods");
		add(10,20);
		mul(20,40);
		div(30,2);
		sub(20,10);
		
		System.out.println("Non-static methods");
		Program4 xy = new Program4();
		xy.add_ns(10, 20);
		xy.sub_ns(20, 10);
		xy.mul_ns(3, 5);
		xy.div_ns(30, 2);
	}

}
