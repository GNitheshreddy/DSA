package com.mru.oops;
 //Hierarichal inheritance
class Parent3{
	int num1 = 100;
}
class Child11 extends Parent3{
	int num2 = 50;
}

class Child12 extends Parent3{
	int num2 =15;
}
public class OOP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child11 obj1 = new Child11();
		System.out.println(obj1.num1+obj1.num2);
		
		Child12 obj2 = new Child12();
		System.out.println(obj2.num1+obj2.num2);

	}

}
