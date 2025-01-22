package com.mru.logics;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
			int n = sc.nextInt();
			if(n%400==0 || n%100!=0 && n%4==0) {
				System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
	}

}
