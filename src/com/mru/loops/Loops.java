package com.mru.loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {100,200,300,400,500};
		int e1 = arr1[0];
		System.out.println("0th index element:"+e1);
		int e2 = arr1[1];
		System.out.println("1st index element:"+e2);
		int e3 = arr1[2];
		System.out.println("2nd index element:"+e3);
		int e4 = arr1[3];
		System.out.println("3rd index element:"+e4);
		int e5 = arr1[4];
		System.out.println("4th index element:"+e5);	
		
		//length
		int n= arr1.length;
		System.out.println("No of elements :"+n);
		
		//for loop
		System.out.println("Elements in array is:");
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("Elements in array using the forEach loop:");
		//forEach loop
		for(int element:arr1) {
			System.out.println(element);
		}
		
		//while loop
		System.out.println("Elements in array using the while loop:");
		int i=0;
		while(i<n) {
			System.out.println(arr1[i]);
			i++;
		}
		
		//do while loop
		System.out.println("Elements in array using the dowhile loop:");
		int x=0;
		do {
			System.out.println(arr1[x]);
			x++;
		}
		while(x<n);
		
		}

	}
