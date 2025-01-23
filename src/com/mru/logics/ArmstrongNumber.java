package com.mru.logics;
//import java.util.Scanner;
//
//public class ArmstrongNumber {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n= sc.nextInt();
//		int ONum =n;w
//		int ans=0;
//		int rem=0;
//		while(n!=0) {
//			rem = n%10;
//			ans = ans + rem*rem*rem;
//			n = n/10;
//		}
//		System.out.println(ans);
//		
//		if(ONum == ans) {
//			System.out.println("It is armstrong number");
//		}else {
//			System.out.println("It is not armstrong number");
//		}
//
//	}
//
//}


import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = sc.nextInt();
		//Store num to original_num to overcome mutability issue
		int original_num = num;
		
		//Step1: read number of digits
		int digits = String.valueOf(num).length();
		
		double result = 0;
		
		while(num!=0) {
			//Step 2:read last digit
			int last = num%10;
			
			//Step 3:do the "last" power of "digits"
			result = result+Math.pow(last,digits);
			
			//Step 4:delete the last number
			num=num/10;
			
		}
		if(original_num == result)
			System.out.println("ArmStrong !!!");
		else
			System.out.println("Not ArmStrong !!!");

	}

}
