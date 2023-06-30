package day07;

public class Program5 {

	public static void main(String[] args) {
		int x=125;
		String result="";
		
		while(x>=1)
		{
		result = x%2+result;
		x=x/2;
		}
		System.out.println(result);
		
		result="";
		for(int y=125;y>=1;y=y/2)
		{
			result = y%2+result;
		}
		System.out.println(result);
	}

}
