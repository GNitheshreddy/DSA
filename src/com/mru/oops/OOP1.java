package com.mru.oops;

class Parent1{
	int x=200;
}

class Child1 extends Parent1{
	int y= 100;
}
public class OOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj = new Child1();
		//or
		//int num1 = obj.x;
		//int num2 = obj.y;
		System.out.println(obj.x);
		System.out.println(obj.y);

	}

}
