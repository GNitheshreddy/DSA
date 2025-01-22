package com.mru.oops;
//multilevel
class Parent2{
	public void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent2{
	public void m2() {
		System.out.println("Child");
	}
}

class Subchild extends Child{
	public void m3() {
		System.out.println("subchild");
	}
}

public class OOP2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subchild obj = new Subchild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}