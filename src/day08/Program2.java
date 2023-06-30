package day08;

import java.util.LinkedList;


public class Program2 {

	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);//2
		x.add(10);
		x.add(20);
		x.add(30);//5
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(130));	
		System.out.println(x.lastIndexOf(30));
		
		x.push(110);
		System.out.println(x);
		
		x.offer(120);
		System.out.println(x);
		x.offerFirst(130);
		System.out.println(x);
		x.offerLast(160);
		System.out.println(x);
		
		x.addFirst(140);
		System.out.println(x);
		x.addLast(150);
		System.out.println(x);
		
		x.removeFirst();
		System.out.println(x);
		x.removeLast();
		System.out.println(x);
		
		x.removeFirstOccurrence(20);
		System.out.println(x);
		
		x.removeLastOccurrence(30);
		System.out.println(x);
		
		System.out.println(x.peek());
		
		System.out.println(x.peekFirst());
		System.out.println(x.peekLast());
		
		System.out.println(x.poll());
		System.out.println(x);
		System.out.println(x.pollFirst());
		System.out.println(x);
		System.out.println(x.pollLast());
		System.out.println(x);	
		
	}

}
