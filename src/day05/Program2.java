package day05;

//child Class
public class Program2 extends Program3{

	public static void main(String[] args) {
		
		Program2 xy = new Program2();
		xy.add(10,20);
		xy.add(20,40);
		xy.add(1,2,3);
		Program3 yx = new Program3();
		mul(10, 20);
		div(30,2);
		yx.sub(30, 10);
	}
	
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		add(a,b);
		System.out.println(a+b+c);
	}
	
	
	

}
