package day08;

import java.util.*;


public class Program3 {

	public static void main(String[] args) {
		
		TreeSet<Integer> y = new TreeSet<Integer>();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(10);
		y.add(20);
		y.add(30);
		System.out.println(y);
		
		y.addAll(Arrays.asList(110,12,23,34,45));
		System.out.println(y);
		
		y.remove(20);
		System.out.println(y);
		
		y.removeAll(Arrays.asList(110,23,34));
		System.out.println(y);
		
		System.out.println(y.size());
		
		System.out.println(y.contains(12));
		System.out.println(y.contains(22));
		System.out.println(y.isEmpty());
		
		y.clear();
		System.out.println(y);
		System.out.println(y.isEmpty());
	}

}
