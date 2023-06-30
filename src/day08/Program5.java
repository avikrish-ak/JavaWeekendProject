package day08;

import java.util.*;


public class Program5 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> std = new HashMap<>();
		std.put(101, "aa");
		std.put(102, "bb");
		std.put(103, "cc");
		std.put(101, "aaa");
		std.put(102, "bbb");
		System.out.println(std);
		
		
		std.replace(101,"aa");
		System.out.println(std);
		
		std.replace(104,"aa");
		System.out.println(std);
		
		
		std.replace(101, "aa", "abc");
		System.out.println(std);
		
		std.replace(105, "aa", "abc");
		System.out.println(std);
		
		std.replace(102, "aa", "abc");
		System.out.println(std);
		
		
		System.out.println(std.size());
		
		System.out.println(std.keySet());
		
		
		System.out.println(std.values());
		
		
		System.out.println(std.entrySet());
		
		System.out.println(std.containsKey(101));
		System.out.println(std.containsKey(106));
		
		System.out.println(std.containsValue("bbb"));
		System.out.println(std.containsValue("dd"));
		
		for(Integer key:std.keySet())
		{
			System.out.println(key);
		}
		
		for(String val:std.values())
		{
			System.out.println(val);
		}
		
		for(Map.Entry<Integer, String> x :std.entrySet())
		{
			System.out.println(x);
		}
		for(Map.Entry<Integer, String> x :std.entrySet())
		{
			System.out.println(x.getValue());
		}
		for(Map.Entry<Integer, String> x :std.entrySet())
		{
			System.out.println(x.getKey());
		}
		
		System.out.println(std.isEmpty());
		
		std.clear();
		System.out.println(std);
		System.out.println(std.isEmpty());
		
		
	}

}
