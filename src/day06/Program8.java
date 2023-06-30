package day06;

public class Program8 {

	public static void main(String[] args) {
	
		int a=1;
		do {
			System.out.println("Java");//1 2 3 4 5
			a=a+1;
		}while(a<=5);//2<=5 3<=5 4<=5 5<=5 6<=5
		
		int b=5;
		do
		{
			System.out.println("Selenium");
			b=b-1;
		}while(b>=1);

		int c=-1;
		do
		{
			System.out.println("python");
			c=c-1;
		}while(c>=-5);
		
		double d=0.1;
		do {
			System.out.println("Selenium -Python");
			d=d+0.1;
		}while(d<=0.5);
		
	}

}
