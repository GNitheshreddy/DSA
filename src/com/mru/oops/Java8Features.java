package com.mru.oops;
import java.util.ArrayList;

public class Java8Features {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		//list1.forEach(num -> System.out.println(num));
		
		//print only even numbers
		list1.stream().filter(num->num%2==0).forEach(System.out::println);
		
		//print only odd numbers
		//list1.stream().filter(num->num)
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		list2.stream().map(num->num*10).forEach(System.out::println);
		
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Hello");
		list3.add("Welcome");
		list3.add("DSA");
		
		//0lleh
		//welcome
		//asd
		//reversing the above input strings
		
		list3.stream().map((name)->{
			return new StringBuilder(name).reverse().toString();
		}).forEach(System.out::println);
		
	}
}
