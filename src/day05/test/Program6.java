package day05.test;

import day05.Program4;

public class Program6 extends Program4{

	public static void main(String[] args) {
		add(10,20);
		//mul(20,40); we can't access from one package to another package
		div(30,2);
		//sub(20,10);private method only access in current class
	}

}
