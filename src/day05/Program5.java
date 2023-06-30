package day05;

public class Program5 extends Program4{

	public static void main(String[] args) {
		System.out.println("static methods");
		add(10,20);
		mul(20,40);
		div(30,2);
		//sub(20,10); private method
		
		System.out.println("Non-static methods");
		Program4 xy = new Program4();
		xy.add_ns(10, 20);
		//xy.sub_ns(20, 10); private method
		xy.mul_ns(3, 5);
		xy.div_ns(30, 2);
	}

}
