package day09;

public class Program2 extends Program1{
	
	int x=110;
	int y=210;

	public static void main(String[] args) {
		
		Program2 xy = new Program2();
		xy.add(xy.x,xy.y);
	}
	
	@Override
	public void add(int a, int b) {
		super.add(super.x, super.y);
		super.add(this.x, this.y);
		System.out.println((a*a)+(b*b));
	}
 
}
