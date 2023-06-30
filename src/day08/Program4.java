package day08;

import java.util.*;


public class Program4 {

	public static void main(String[] args) {
		
		TreeSet<Integer> x = new TreeSet<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		
		TreeSet<Integer> y = new TreeSet<Integer>();
		y.add(40);
		y.add(50);
		y.add(30);
		
		System.out.println(y);
		TreeSet<Integer> xUniony = new TreeSet<Integer>(x);
		xUniony.addAll(y);
		
		System.out.println(xUniony);
		
		TreeSet<Integer> xintery = new TreeSet<Integer>(x);
		xintery.retainAll(y);
		System.out.println(xintery);
		
		TreeSet<Integer> xdiffy = new TreeSet<Integer>(x);
		xdiffy.removeAll(y);
		System.out.println(xdiffy);
		
		TreeSet<Integer> ydiffx = new TreeSet<Integer>(y);
		ydiffx.removeAll(x);
		System.out.println(ydiffx);
		
		
		
		
	}

}
