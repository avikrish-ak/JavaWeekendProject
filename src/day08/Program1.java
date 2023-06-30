package day08;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<Integer> x = new LinkedList<Integer>();
		x.add(10);//0
		x.add(20);//1
		x.add(30);//2
		x.add(10);//3
		x.add(20);//4
		x.add(30);//5
		System.out.println(x);
		
		System.out.println(x.size());
		
		System.out.println(x.get(2));
		
		x.add(3, 123);
		System.out.println(x);
		
		x.set(3, 321);
		System.out.println(x);
		
		Integer[] a= {12,23,34,45,56};
		
		x.addAll(Arrays.asList(a));
		
		System.out.println(x);
		
		x.addAll(2,Arrays.asList(a));
		
		System.out.println(x);
		
		x.remove(3);
		
		System.out.println(x);
		x.removeAll(Arrays.asList(a));
		System.out.println(x);
		
		System.out.println(x.contains(20));
		System.out.println(x.contains(110));
		
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		
		
	}

}
