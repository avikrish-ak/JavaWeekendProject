package day07;

public class Program1 {

	public static void main(String[] args) {

		int num=11;

		boolean flag =true;

		int a=2;
		while(a<num)
		{
			if(num%a==0)
			{
				flag=false;
				break;
			}
			a=a+1;
		}

		if(flag)
		{
			System.out.println("Prime number :-"+num);
		}
		else
		{
			System.out.println("Not a Prime number :-"+num);
		}




	}

}
