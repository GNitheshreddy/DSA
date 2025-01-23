package com.mru.logics;
/*import java.util.Scanner;

public class FibinociiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for series:");
		int n = sc.nextInt();
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		int count=0;
		while(count<=n) {
			int temp = b;
			 b =a+b;
			 a = temp;
			 count++;
			 System.out.println(b);
		}

	}

}*/

import java.util.Scanner;

public class FibinociiSeries {

	public static void main(String[] args) {
//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int[] fib = new int[10];
		
		fib[0] = 0;
		fib[1] = 1;
		
		System.out.print(fib[0]+ " "+fib[1]+" ");
		for(int i=2;i<n;i++) {
			fib[i] = fib[i-1] + fib[i-2];
			
		}
		for(int element:fib) {
			System.out.println(element+ " ");
		}

	}

}
