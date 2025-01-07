package com.mru.methods;

public class Methods {
	//no return type and no parameter
	public void leetCode() {
		System.out.println("Welcome to leetcode");
	}
	//no return type and with parameter
	public void codechef(String name) {
		System.out.println("welcome to "+name);
	}
	//with return type and with no parameter
	public String hackerRank() {
		return "Bye";
	}
	//with return type and with parameter
	public String wish(String name) {
		return "Welcome to "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj = new Methods();
		obj.leetCode();
		obj.codechef("Logic Building Sessions!");
		String res = obj.hackerRank();
		System.out.println(res);
		System.out.println(obj.wish("MRU"));

	}

}
