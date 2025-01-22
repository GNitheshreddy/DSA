package com.mru.oops;
//MethodOverriding
	
	class Parent12{
		public void dbConn() {
		System.out.println("Data from oracle soon..");
		
	}
	}
	
	class Child13 extends Parent12{
		public void dbConn() {
			System.out.println("data from mongodb soon..");
		}
		
	}
	public class OOP5 {

	public static void main(String[] args) {
		Child13 obj = new Child13();
		obj.dbConn();
	}

}
