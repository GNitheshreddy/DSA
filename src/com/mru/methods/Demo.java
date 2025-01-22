package com.mru.methods;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adapter adapter =  new Adapter();
		Test1 obj1 = adapter.getInstance1();
		String res1 = obj1.msg;
		System.out.println(res1);
		obj1.m1();
		
		Test2 obj2 = adapter.getInstance2();
		String res2 = obj2.str1;
		System.out.println(res2);
		obj2.m2();
		

	}

}
