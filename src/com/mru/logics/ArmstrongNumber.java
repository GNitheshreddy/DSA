package com.mru.logics;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int ONum =n;
		int ans=0;
		int rem=0;
		while(n!=0) {
			rem = n%10;
			ans = ans + rem*rem*rem;
			n = n/10;
		}
		System.out.println(ans);
		
		if(ONum == ans) {
			System.out.println("It is armstrong number");
		}else {
			System.out.println("It is not armstrong number");
		}

	}

}
