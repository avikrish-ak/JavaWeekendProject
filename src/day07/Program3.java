package day07;

public class Program3 {

	public static void main(String[] args) {
		int num=20;
		long result=1;
		
		int a=1;
		while(a<=num)
		{
			result=result*a;//1,2,6,24,120
			System.out.println(result);
			a=a+1;
		}
		
		
		result=1;
		for(int b=1;b<=num;b=b+1)
		{
			result=result*b;//1,2,6,24,120
			System.out.println(result);
		}
	}

}
