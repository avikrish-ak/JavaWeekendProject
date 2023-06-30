package day07;

public class Program4 {

	public static void main(String[] args) {
		int x=153;
		double result=0;
		String num= String.valueOf(x);//"1634"
		
		int count = num.length();//4
		
		for(int i=0;i<count;i=i+1)
		{
			String snum = num.charAt(i)+"";//1
			Integer y = Integer.parseInt(snum);
			result = result+Math.pow(y, count);
			
		}
		
		System.out.println(result);
		
		if(x==result)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
		
	}

}
